/*
 *                           Program: 35
 *  Write a program to establish the connection between Java program to database.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q35_connection_bw_JDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rajdb";
        String user = "root";
        String usPassword = "raj@2002";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, usPassword);
            if (connection != null) {
                System.out.println("Connected to the database!");
                connection.close();
            }
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error connecting to the database!");
            e.printStackTrace();
        }
    }
}

/*
 *    Output:
 *    Connected to the database!
 */