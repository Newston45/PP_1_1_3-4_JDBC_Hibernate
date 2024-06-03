package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();

        userDao.saveUser("misha", "ivanov", (byte) 28);
        userDao.saveUser("anna", "ivanova", (byte) 26);
        userDao.saveUser("alex", "petrov", (byte) 56);
        userDao.saveUser("Chippi", "Chappa", (byte) 1);

        System.out.println(userDao.getAllUsers().toString());

        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
