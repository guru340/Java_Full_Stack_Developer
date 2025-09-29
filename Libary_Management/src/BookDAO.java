import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public void AddBooks(Book book)throws SQLException{
        String querry="INSERT INTO book (Title, AuthorName, Available) VALUES (?, ?, ?)";
        try(Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement(querry)){
            preparedStatement.setString(1,book.getTitle());
            preparedStatement.setString(2,book.getAuthor());
            preparedStatement.setBoolean(3, book.getAvailable());
            preparedStatement.executeUpdate();
        }
    }
    public List<Book> getALLBooks() throws SQLException{
        List<Book> bookList=new ArrayList<>();
        String query="SELECT * FROM BOOK";
         try(Connection connection=DBConnection.getConnection();
             Statement st=connection.createStatement();
             ResultSet rs=st.executeQuery(query)){
                while (rs.next()){
                    Book b = new Book(
                            rs.getString("title"),
                            rs.getInt("id"),
                            rs.getString("AuthorName"),
                            rs.getBoolean("available")
                    );
                    bookList.add(b);
                }
        }
         return bookList;
    }
    public Book getBookById(int id) throws SQLException {
        String sql = "SELECT * FROM book WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Book(
                            rs.getString("title"),
                            rs.getInt("id"),
                            rs.getString("author"),
                            rs.getBoolean("available")
                    );
                }
            }
        }
        return null;
    }
    public void updateBook(Book book) throws SQLException {
        String sql = "UPDATE book SET title = ?, author = ?, available = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, book.getTitle());
            ps.setString(2, book.getAuthor());
            ps.setBoolean(3, book.getAvailable());
            ps.setInt(4, book.getId());
            ps.executeUpdate();
        }
    }



    public void deleteBook(int id) throws SQLException {
        String sql = "DELETE FROM books WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }


    public void setAvailability(int bookId, boolean available) throws SQLException {
        String sql = "UPDATE books SET available = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setBoolean(1, available);
            ps.setInt(2, bookId);
            ps.executeUpdate();
        }
    }
}
