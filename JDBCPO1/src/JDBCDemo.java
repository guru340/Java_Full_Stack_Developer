import java.sql.*;
import java.util.concurrent.ExecutionException;

public class JDBCDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd","root","Sonal@Mayank346");
            Statement statement=con.createStatement();
            String query="select *from student";
            ResultSet rs=statement.executeQuery(query);
            System.out.println("-------------Read Data------------");
            while(rs.next()){
                System.out.println(
                        rs.getInt("id")+" | "+rs.getString("stdName")+ " | "+rs.getInt("age"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
