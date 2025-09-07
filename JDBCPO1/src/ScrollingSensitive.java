import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollingSensitive {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mystd","root","Sonal@Mayank346");
            Statement statement=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            String query="select *from student";
            ResultSet rs=statement.executeQuery(query);
//            System.out.println("-------Scroll insensitive,Read Only------------");
//
//            rs.last();
//            System.out.println(" Last Row: "+rs.getInt("id"));
//            System.out.println(" Last Row: "+rs.getString("stdName"));
//
//            rs.first();
//            System.out.println(" First Row: "+rs.getInt("id"));
//            System.out.println(" First  Row: "+rs.getString("stdName"));
//
//            rs.absolute(2);
//            System.out.println(" Last Row: "+rs.getInt("id"));
//            System.out.println(" Last Row: "+rs.getString("stdName"));
//           TYPE_SCROLL_INSENSTIVE
//            System.out.println("fetch data in not live update mode.......");
//            Thread.sleep(10000);
//            rs.beforeFirst();
//            while(rs.next()){
//                System.out.println(
//                        rs.getInt("id")+" | "+rs.getString("stdName")+ " | "+rs.getInt("age"));
//            }
//            con.close();

            System.out.println("fetch data  live update mode.......");
            Thread.sleep(10000);
            rs.beforeFirst();
            while(rs.next()){
                System.out.println(
                        rs.getInt("id")+" | "+rs.getString("stdName")+ " | "+rs.getInt("age"));
            }
            con.close();



        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
