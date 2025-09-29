import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    public void AddMembers(Member member) throws SQLException {
        String query="INSERT INTO Members (name,email) VALUES (?, ?)";
        try (Connection connection=DBConnection.getConnection();
             PreparedStatement preparedStatement=connection.prepareStatement(query)){
            preparedStatement.setString(1, member.getName());
            preparedStatement.setString(2, member.getEmail());
            preparedStatement.executeUpdate();
        }
    }

    public List<Member> getALLMembers() throws SQLException{
        List<Member> bookList=new ArrayList<>();
        String query="SELECT * FROM Members";
        try(Connection connection=DBConnection.getConnection();
            Statement st=connection.createStatement();
            ResultSet rs=st.executeQuery(query)){
            while (rs.next()){
                Member b = new Member(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"));
                bookList.add(b);
            }
        }
        return bookList;
    }

    public void updatemeber(Member member) throws SQLException{
        String query="UPDATE Members SET name = ?, email = ?,WHERE id = ?";
       try (Connection connection=DBConnection.getConnection();
       PreparedStatement preparedStatement=connection.prepareStatement(query)){
           preparedStatement.setString(1, member.getName());
           preparedStatement.setString(2, member.getEmail());
           preparedStatement.executeUpdate();
       }
    }
    public void deleteMember(int id) throws SQLException{
        String query="DELETE FROM Members WHERE id = ?";
        try(Connection connection=DBConnection.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(query)) {
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
        }
    }


}
