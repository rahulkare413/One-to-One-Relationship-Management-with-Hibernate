package Demo;

import Connection.SessionFactoryHelper;
import Model.PassportInfo;
import Model.PersonInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class InsertData {
    public static void main(String[] args) {

        SessionFactory sessionFactory = SessionFactoryHelper.sessionFactory();
        Session session = sessionFactory.openSession();

        PassportInfo passportInfo = new PassportInfo();
        passportInfo.setPassportNumber(123456789);
        passportInfo.setCountry("INDIA");

        PersonInfo personInfo = new PersonInfo();
        personInfo.setPersonFirstName("ATMARAM");
        personInfo.setPersonLastName("BHIDE");
        personInfo.setPersonAge(55);
        personInfo.setPersonSalary(77777.77);
        personInfo.setPassportRef(passportInfo);

        Transaction tx = session.beginTransaction();
        session.save(personInfo);
        tx.commit();
        session.close();
        sessionFactory.close();
    }
}
