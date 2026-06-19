import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class GalleryApp {

    static final String URL = "jdbc:mysql://localhost:3306/gallery";
    static final String USER = "root";
    static final String PASSWORD = "password1";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Creating connection To DataBase
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Data Base Connected ...");

            while (true) {
                System.out.println("===== GALLERY MENU =====");
                System.out.println("1. Insert Image");
                System.out.println("2. Save Image by ID");
                System.out.println("3. Delete Image");
                System.out.println("4. List Images");
                System.out.println("5. Exit");
                System.out.print("Enter Your choice: ");

                int choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {

                    case 1:
                        insertImage(con, sc);
                        break;

                    case 2:
                        saveImage(con, sc);
                        break;

                    case 3:
                        deleteImage(con, sc);
                        break;

                    case 4:
                        listImages(con);
                        break;

                    case 5:
                        con.close();
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            System.out.println("Something Went Wrong, Please Try Again ! ");
            ;
        }
    }

    // Method To Insert Image
    static void insertImage(Connection con, Scanner sc) {
        try {
            System.out.print("Enter image name: ");
            String name = sc.nextLine();

            System.out.print("Enter image path: ");
            String path = sc.nextLine();

            // Creating PreparedStatement for executing Query
            String query = "INSERT INTO images (name, image) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            // Using FileInputStream To Read Image and it Reads files as Raw Binary
            FileInputStream fis = new FileInputStream(path);

            ps.setString(1, name);
            ps.setBinaryStream(2, fis);

            ps.executeUpdate();

            System.out.println("Image inserted successfully!");

            fis.close();

        } catch (SQLException e) {
            System.out.println("SQL Exception ");
        } catch (IOException e) {
            System.out.println("Input/Output Exception !");
        }
    }

    // Save Image Method
    static void saveImage(Connection con, Scanner sc) {
        try {
            System.out.print("Enter image ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            String query = "SELECT image, name FROM images WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                byte[] img = rs.getBytes("image");
                String name = rs.getString("name");
                System.out.println("Enter folder path to save image:");
                System.out.println("Example: E:\\download");
                String save_image = sc.nextLine();
                File file = new File(save_image, name + ".jpg");
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(img);

                System.out.println("Image Saved To " + save_image);

                fos.close();
            } else {
                System.out.println("Image not found!");
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception ");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found !");
        } catch (IOException e) {
            System.out.println("Input/Output Exception !");
        }
    }

    // Method To  Delete Image
    static void deleteImage(Connection con, Scanner sc) {
        try {
            System.out.print("Enter image ID to delete: ");
            int id = sc.nextInt();

            String query = "DELETE FROM images WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Image deleted!");
            } else {
                System.out.println("Image not found!");
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception ");
            ;
        }
    }

    //  Listing Images
    static void listImages(Connection con) {
        try {
            String query = "SELECT id, name FROM images";
            Statement st = con.createStatement();

            boolean isEmpty = true;
            ResultSet rs = st.executeQuery(query);

            System.out.println("--- Image List ---");
            while (rs.next()) {
                isEmpty = false;
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }
            if (isEmpty) {
                System.out.println("No Images Found In DataBase !");
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("SQL Exception ");
        }
    }
}