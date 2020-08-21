package Model.Util;
import java.sql.*;

/**
 * Created by shahin_yzd on 8/20/2020.
 */
public class ConnectionProvider {

    private Connection connection;

     static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException xe) {
           xe.printStackTrace();
        }

    }

    public Connection getConnection(){

         try {
             return DriverManager.getConnection("jbdc:oracle:thin:@localhost:1521:orcl", "shahin", "java123");
         } catch (SQLException e) {
             e.printStackTrace();
         }
         return null;
    }
}
