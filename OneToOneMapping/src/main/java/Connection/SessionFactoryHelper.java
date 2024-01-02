package Connection;

import Model.PassportInfo;
import Model.PersonInfo;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryHelper {

  public static SessionFactory sessionFactory(){
        Configuration cfg = new Configuration();
        cfg = cfg.configure().addAnnotatedClass(PassportInfo.class).addAnnotatedClass(PersonInfo.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();

        return sessionFactory;

    }
}
