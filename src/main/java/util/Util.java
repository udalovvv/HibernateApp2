package util;

import models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {

    public static Session getSession(){
        try {
            Configuration configuration = new Configuration()
                            .addAnnotatedClass(User.class);
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            System.out.println("Connection OK");
            return sessionFactory.getCurrentSession();
        } catch (Exception e) {
            e.getStackTrace();
        }
        return null;
    }

}
