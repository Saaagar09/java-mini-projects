import java.sql.*;
public class Main {
    public static void main(String[] args){

        /* Note : Check mysql Connector is added to External Libraries of Java Project (mysql-connector-j-9.7.0)
                  Important to add mysql connector for Loading SQL Drivers (for intelliJ)
        */

        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "password1";
        // SQL Query for Printing Data of a Table
        String query ="SELECT * FROM employees;";

        // Loading Drivers
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully ! ");
        }catch (ClassNotFoundException e){
            System.out.println("Class Not Found !!! Unable To Load Driver ");
        }
        // Creating Connection
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("-----------------------------------");
            System.out.println("ID  NAME    JOB TITLE    SALARY");
            System.out.println("-----------------------------------");

            // Printing DATA From DataBase
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String job_title = rs.getString("job_title");
                double salary = rs.getDouble("salary");
                System.out.println(id + "   " + name + "   " + job_title + "   " + salary);
                System.out.println("-----------------------------------");
            }
            // Closing it
            rs.close();
            stmt.close();
            con.close();
            System.out.println("Data Base DissConnected !");
        }catch (SQLException e){
            System.out.println("Sql Exception !");
        }
    }
}