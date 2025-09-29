import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransctionDAO {
    public void issueBook(int bookId, int memberId) throws SQLException {
        String sql = "INSERT INTO Transction (book_id, member_id, issue_date, return_date) VALUES (?, ?, ?, NULL)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, bookId);
            ps.setInt(2, memberId);

            // Convert util.Date → sql.Date
            java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
            ps.setDate(3, sqlDate);

            ps.executeUpdate();
        }

        // ✅ Mark book unavailable (correct table and syntax)
        String updateBook = "UPDATE Book SET available = false WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(updateBook)) {
            stmt.setInt(1, bookId);
            stmt.executeUpdate();
        }
    }

    public void returnBook(int transactionId) throws SQLException {
        int bookId = -1;

        // 1) update transaction return_date
        String sql = "UPDATE Transction SET return_date = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, new java.sql.Date(System.currentTimeMillis())); // today’s date
            stmt.setInt(2, transactionId);
            stmt.executeUpdate();
        }

        // 2) fetch book_id from this transaction
        String fetchSql = "SELECT book_id FROM Transction WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(fetchSql)) {
            stmt.setInt(1, transactionId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                bookId = rs.getInt("book_id");
            }
        }

        // 3) set book available again
        if (bookId != -1) {
            String updateBook = "UPDATE Book SET available = true WHERE id = ?";
            try (Connection conn = DBConnection.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(updateBook)) {
                stmt.setInt(1, bookId);
                stmt.executeUpdate();
            }
        }
    }


    // Fetch all transactions
    public List<Transction> getAllTransactions() throws SQLException {
        List<Transction> list = new ArrayList<>();
        String sql = "SELECT * FROM Transction";

        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Transction(
                        rs.getInt("id"),
                        rs.getInt("book_id"),
                        rs.getInt("member_id"),
                        rs.getDate("issue_date"),
                        rs.getDate("return_date")
                ));
            }
        }
        return list;
    }
}
