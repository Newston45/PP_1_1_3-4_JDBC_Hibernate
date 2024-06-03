package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class Util {
    public static Connection getConnection() {
        Connection conn;
        try{
            // реализуйте настройку соеденения с БД
            ResourceBundle reader = ResourceBundle.getBundle("dbconfig");
            Class.forName(reader.getString("db.driver"));
            conn = DriverManager.getConnection(reader.getString("db.url"), reader.getString("db.username"),
                                               reader.getString("db.password"));
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException("Could not get connection", e);
        }
    }
}
