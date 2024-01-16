import dao.UserDao;
import dao.UserDaoHibernateImpl;
import models.User;
import util.Util;

import java.util.List;

public class main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoHibernateImpl();
//        userDao.createUsersTable();
        userDao.saveUser("Виталий", "Udalov", (byte)30);
        userDao.saveUser("Ярослав", "Чесанов", (byte)14);
//        List<User> userList = userDao.getAllUsers();
//        for (User user : userList) {
//            System.out.println(user);
//        }
//    userDao.dropUsersTable();

    }
}
