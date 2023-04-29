import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class JDBC_Conncetion{
    public static void main(String[] args) throws SQLException {

        // Set username, password, and url for database connection
        String username = "root";
        String password = "josh";
        String url = "jdbc:mysql://localhost:3306/hr";

        // SQL query to retrieve department names from departments table
        String sql = "SELECT department_name FROM departments";

        // Establish a database connection
        Connection connection = DriverManager.getConnection(url, username , password);

        // Create a statement object to execute the SQL query
        Statement statement = connection.createStatement();

        // Execute the SQL query and store the results in a ResultSet object
        ResultSet resultSet = statement.executeQuery(sql);

        // Print the connection details to console
        System.out.println(connection);

        // Loop through the ResultSet and print department id and name to console
        while(resultSet.next()){
            System.out.println(resultSet.getInt(columnLabel:"department_id")+ "-->");
            System.out.println(resultSet.getString(columnLabel:"department_name" ));
        }

        // Close the ResultSet, statement, and connection
        resultSet.close();
        statement.close();
        connection.close();
    }
}
