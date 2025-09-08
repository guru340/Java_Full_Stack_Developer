package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {
    private static final String URL = "jdbc:mysql://localhost:3306/garage";
    private static final String User= "root";
    private static final String Pass= "Sonal@Mayank346";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,User,Pass);
    }
}