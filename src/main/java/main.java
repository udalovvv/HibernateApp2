import dao.UserDao;
import dao.UserDaoHibernateImpl;
import util.Util;

public class main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.dropUsersTable();

    }
}
