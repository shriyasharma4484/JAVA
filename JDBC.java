import java.sql.*;

public class JDBC {
    public static void main(String[] args) {

        // Database details
        String url = "jdbc:mysql://localhost:3306/hospital_management";
        String username = "root";
        String password = "Shriya@26";

        // Query 
        String query = "SELECT docName FROM Doctor";

        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // this  Establishes the  Connection
            Connection con =  DriverManager.getConnection(url,username,password);
            System.out.println("Connection Established Successfully");

            Statement st = con.createStatement(); //statement object to execute the query

            // Execute Query
            ResultSet rs = st.executeQuery(query);

            // Process Results
            System.out.println("Doctor Names:");
            while (rs.next()) {
                String docName = rs.getString("docName");
                System.out.println(docName );
            }

            // Close Resources
            rs.close();
            st.close();
            con.close();

            System.out.println("Connection Closed Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}