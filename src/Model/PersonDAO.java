package Model;

import Model.Util.ConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by shahin_yzd on 8/20/2020.
 */
public class PersonDAO {

   /* public PersonDAO() throws SQLException {
        ConnectionProvider connectioner =new ConnectionProvider();
        connectioner.getConnection();
    }
    */
    public static boolean check(String n, String p) {
        boolean vaild=false;
        try {
            ConnectionProvider connectioner =new ConnectionProvider();
            PreparedStatement   preparedStatement = connectioner.getConnection().prepareStatement("SELECT * from Employee where user=? and pass=?");
            preparedStatement.setString(1, "name");
            preparedStatement.setString(2, "password");
            ResultSet resultSet=preparedStatement.executeQuery();
            vaild=resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vaild;
    }

}
