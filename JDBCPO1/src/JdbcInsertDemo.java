import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcInsertDemo {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd","root","Sonal@Mayank346");
            Statement statement=con.createStatement();
            String query="INSERT INTO student(id,stdname,age) values(3,'Pawan',25)";
            int update=statement.executeUpdate(query);

            System.out.println(" Inserted " + update + " Rows ") ;

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
