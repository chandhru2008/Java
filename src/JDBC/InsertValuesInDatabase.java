package JDBC;

import java.sql.*;

public class InsertValuesInDatabase {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc_demo"; // jdbc_demo is database name
        String userName = "root";
        String passWord = "----";//Password

        Connection con = DriverManager.getConnection(url, userName, passWord);
        Statement st = con.createStatement();
        String query = "INSERT INTO students VALUES(5,'Manoj',80.4)"; // Directly pass the values in params
        int rowsForDirectParams = st.executeUpdate(query); // The executeUpdate method update the table and return the affected rows that why we catch that int
        System.out.println(rowsForDirectParams); // output is 1 because we affect one row


        // Insert the data by storing them in a variable. It is important to store the  data in variable when data came in dynamically
        int id = 6;
        String name = "Sakthi";
        float Gpa = 90.06f;
        String queryWithVariables = "INSERT INTO students VALUES("+id+", '"+name+"', "+Gpa+");"; // very hard to write
        int rowsForVariables = st.executeUpdate(queryWithVariables);
        System.out.println(rowsForVariables);

        // PreparedStatement help us to
        int idForPrs = 7;
        String nameForPrs = "Agas";
        float GpaForPrs = 80.4f;


        // Prepare the Query (with placeholders ?)
        String queryWithPreparedStatement = "INSERT INTO students VALUES(?,?,?);"; // Use placeholders (?) instead of string concatenation for dynamic queries. Easy to write
        PreparedStatement pre = con.prepareStatement(queryWithPreparedStatement);
        pre.setInt(1, idForPrs);
        pre.setString(2, nameForPrs);
        pre.setFloat(3, GpaForPrs);
        pre.executeUpdate();
        con.close();

    }
}
