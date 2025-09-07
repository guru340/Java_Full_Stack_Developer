import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertUsingPrepareDemo {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd","root","Sonal@Mayank346");

            String query="Insert Into student(id,stdName,age) values(?,?,?)";
            PreparedStatement statement=con.prepareStatement(query);
            statement.setInt(1,101);
            statement.setString(2,"Manku");
            statement.setInt(3,25);

            statement.setInt(1,103);
            statement.setString(2,"Manku");
            statement.setInt(3,25);

            statement.setInt(1,102);
            statement.setString(2,"Manku");
            statement.setInt(3,25);

            int update=statement.executeUpdate();
            System.out.println(" Rows Updated==> "+update);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
