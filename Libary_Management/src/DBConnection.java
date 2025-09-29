import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

        private static final String URL = "jdbc:mysql://localhost:3306/lib";
        private static final String USER = "root"; // change if needed
        private static final String PASSWORD = "Sonal@346"; // change


        static {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                System.err.println("MySQL JDBC Driver not found.");
                e.printStackTrace();
            }
        }


        public static Connection getConnection () throws SQLException {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
    }
