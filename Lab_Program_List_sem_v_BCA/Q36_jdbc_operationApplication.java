/*
 *                            Program: 36
 * 	     Develop a java application to perform insert, update, 
 *       retrieve and delete the record from the database in JDBC.
 */

 import java.sql.*;
 import java.util.Scanner;
 
 public class Q36_jdbc_operationApplication {
     public static void main(String[] args) {
         try {
             MyDatabase myDatabase = new MyDatabase();
             Scanner sc = new Scanner(System.in);
 
             while (true) {
                 System.out.println("1.Insert");
                 System.out.println("2.Update");
                 System.out.println("3.Retrieve");
                 System.out.println("4.Delete");
                 System.out.println("5.Exit");
                 System.out.print("Choose the correct option:");
                 int option = sc.nextInt();
                 sc.nextLine();
 
                 switch (option) {
                     case 1: {
                         System.out.print("Enter the Name: ");
                         String name = sc.nextLine();
                         System.out.print("Enter the Email: ");
                         String email = sc.nextLine();
                         System.out.print("Enter the Mobile Number: ");
                         String mobileNumber = sc.nextLine();
                         myDatabase.insert(name, email, mobileNumber);
                     }
                     break;
                     case 2: {
                         System.out.print("Enter the id number you want to update: ");
                         int id = sc.nextInt();
                         sc.nextLine();
                         System.out.print("Enter the Name: ");
                         String name = sc.nextLine();
                         System.out.print("Enter the Email: ");
                         String email = sc.nextLine();
                         System.out.print("Enter the Mobile Number: ");
                         String mobileNumber = sc.nextLine();
                         myDatabase.update(id, name, email, mobileNumber);
                     }
                     break;
                     case 3: {
                         myDatabase.retrieve();
                     }
                     break;
                     case 4: {
                         System.out.print("Enter the id number you want to delete: ");
                         int id = sc.nextInt();
                         myDatabase.delete(id);
                     }
                     break;
                     case 5: {
                         System.exit(0);
                     }
                     default:
                         System.out.println("Invalid option!");
                 }
             }
         } catch (SQLException e) {
             System.out.println("Error: "+e);
             e.printStackTrace();
         }
     }
 }
 
 class MyDatabase {
     private static Statement statement;
 
     MyDatabase() throws SQLException {
         String JDBC_URL = "jdbc:mysql://localhost:3306/rajdb";
         String USERNAME = "root";
         String PASSWORD = "raj@2002";
         Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
         statement = connection.createStatement();
     }
 
     public void insert(String name, String email, String mobileNumber) {
         try {
             String query = "INSERT INTO register (name, email, mobileNumber) VALUES ('" + name + "','" + email + "','" + mobileNumber + "')";
             statement.executeUpdate(query);
             System.out.println("Data successfully inserted.");
         } catch (SQLException e) {
             e.printStackTrace();
         }
     }
 
     public void retrieve() {
         try {
             String query = "SELECT * FROM register";
             ResultSet resultSet = statement.executeQuery(query);
             while (resultSet.next()) {
                 int id = resultSet.getInt("id");
                 String name = resultSet.getString("name");
                 String email = resultSet.getString("email");
                 String mobileNumber = resultSet.getString("mobileNumber");
                 System.out.println("id: "+id+"\nName: " + name + "\nEmail: " + email + "\nMobile Number: " + mobileNumber);
             }
         } catch (SQLException e) {
             System.out.println("Error: "+e);
             e.printStackTrace();
         }
     }
 
     public void update(int id, String newName, String newEmail, String newMobileNumber) {
         try {
             String query = "UPDATE register SET name='" + newName + "', email='" + newEmail + "', mobileNumber='" + newMobileNumber + "' WHERE id=" + id;
             statement.executeUpdate(query);
             System.out.println("Data successfully updated");
         } catch (SQLException e) {
             System.out.println("Error: "+e);
             e.printStackTrace();
         }
     }
 
     public void delete(int id) {
         try {
             String query = "DELETE FROM register WHERE id=" + id;
             statement.executeUpdate(query);
             System.out.println("Data successfully deleted");
         } catch (SQLException e) {
             System.out.println("Error: "+e);
             e.printStackTrace();
         }
     }
 }
 
 /*
 Output:
 1.Insert
 2.Update
 3.Retrieve
 4.Delete
 5.Exit
 Choose the correct option:1
 Enter the Name: Raj Kishor
 Enter the Email: rajkishorbgp6@gmail.com
 Enter the Mobile Number: 6207313766
 Data successfully inserted.
 1.Insert
 2.Update
 3.Retrieve
 4.Delete
 5.Exit
 Choose the correct option:3
 id: 3
 Name: Raj Kishor
 Email: rajkishorbgp6@gmail.com
 Mobile Number: 6207313766
 1.Insert
 2.Update
 3.Retrieve
 4.Delete
 5.Exit
 Choose the correct option:2
 Enter the id number you want to update: 3
 Enter the Name: raj
 Enter the Email: raj@gmail.com
 Enter the Mobile Number: 6396962870
 Data successfully updated
 1.Insert
 2.Update
 3.Retrieve
 4.Delete
 5.Exit
 Choose the correct option:3
 id: 3
 Name: raj
 Email: raj@gmail.com
 Mobile Number: 6396962870
 1.Insert
 2.Update
 3.Retrieve
 4.Delete
 5.Exit
 Choose the correct option:4
 Enter the id number you want to delete: 3
 Data successfully deleted
 1.Insert
 2.Update
 3.Retrieve
 4.Delete
 5.Exit
 Choose the correct option:3
 1.Insert
 2.Update
 3.Retrieve
 4.Delete
 5.Exit
 Choose the correct option:5
 
 Process finished with exit code 0
 
  */