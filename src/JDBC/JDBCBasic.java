package JDBC;
import java.sql.*;
public class JDBCBasic {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/jdbc_demo"; // jdbc_demo is database name
        String userName = "root";
        String passWord = "----";//Password

        Connection con = DriverManager.getConnection(url,userName,passWord);
        String query = "SELECT * from students"; // query to execute
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query); // This is the result set
        System.out.println("id name Gpa"); //Heading of the table

      while(rs.next()){ //rs.next() moves the cursor to the next row in the result set. return true if the row exit else false;
          int id = rs.getInt(1); // print the first row. So the row contains int(id) that is why we catch that in a int
          String name = rs.getString(2);
          float Gpa = rs.getFloat(3);
          System.out.println(id + " | " + name + " | " +Gpa);
      }
      con.close(); // It is our responsibility to close our database
    }
}
