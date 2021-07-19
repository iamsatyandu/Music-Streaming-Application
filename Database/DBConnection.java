package Database;
import java.sql.*;
public class DBConnection {
    private String host = "jdbc:mysql://127.0.0.1:3306/BAJAO";
    private String user = "root";
    private String passowrd = "panda@123";

    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(host, user,passowrd);
            System.out.println("Connection made "  + connection);
        }
        catch (Exception  e ){
            System.out.println("An error occurred while connecting to DATABASE");
            System.out.println(e);
        }
        return connection;
    }
}
