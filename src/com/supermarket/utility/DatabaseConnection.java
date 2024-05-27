package com.supermarket.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
<<<<<<< HEAD
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/Supermarket";
=======
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/supermarket_data";
>>>>>>> 3cf0032 (insert product functionality)
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    // Load the JDBC driver
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    // Method to get a connection to the database
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Method to close the connection
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
