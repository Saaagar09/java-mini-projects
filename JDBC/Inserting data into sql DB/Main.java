import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "password1";
        // SQL Query for Inserting Data of a Table
        String query = "INSERT INTO students (id,name,course,price) VALUES (1,'Sagar','Java',1000.0);";

        // Loading Drivers
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully ! ");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found !!! Unable To Load Driver ");
        }
        // Creating Connection
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to Database !");
            Statement stmt = con.createStatement();
            System.out.println("Statement Created !");
            /*
             * executeUpdate() method for inserting|Updating|deleting data from db .
             * This method returns int i.e tells how many rows affected , means we need to
             * store (rows affected) into
             * integer type variable for printing if data is entered or not
             */
            int affected = stmt.executeUpdate(query);
            System.out.println("Query Executed !");

            if (affected > 0) {
                System.out.println("Inserted Successfully rows( " + affected + " ) Affected.");
            } else {
                System.out.println("Data Did Not Inserted ! ");
            }

            // Closing it
            stmt.close();
            con.close();
            System.out.println("Data Base DissConnected !");
        } catch (SQLException e) {
            System.out.println("Sql Exception !");
        }
    }
}