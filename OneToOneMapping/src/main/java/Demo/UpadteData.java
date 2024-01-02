package Demo;

import Connection.SessionFactoryHelper;
import Model.PersonInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpadteData {
    public static void main(String[] args) {

        SessionFactory sessionFactory = SessionFactoryHelper.sessionFactory();
        Session session = sessionFactory.openSession();

        PersonInfo p1 = session.load(PersonInfo.class,2);

        p1.getPassportRef().setCountry("AMERICA");
        session.update(p1);
        Transaction tx = session.beginTransaction();
        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
