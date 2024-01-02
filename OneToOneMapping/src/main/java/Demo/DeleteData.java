package Demo;

import Connection.SessionFactoryHelper;
import Model.PersonInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteData {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryHelper.sessionFactory();
        Session session = sessionFactory.openSession();

        PersonInfo p1 = session.load(PersonInfo.class,2);
        p1.getPassportRef().setPassportId(1);

        Transaction tx = session.beginTransaction();
        session.delete(p1);
        tx.commit();
        session.close();
    }
}
