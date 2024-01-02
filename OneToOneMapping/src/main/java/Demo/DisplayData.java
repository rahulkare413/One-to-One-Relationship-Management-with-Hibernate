package Demo;

import Connection.SessionFactoryHelper;
import Model.PersonInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DisplayData {
    public static void main(String[] args) {
        SessionFactory sessionFactory = SessionFactoryHelper.sessionFactory();
        Session session = sessionFactory.openSession();

        PersonInfo personInfo = session.load(PersonInfo.class,1);

        System.out.println("PERSON FIRST NAME " + personInfo.getPersonFirstName());
        System.out.println("PERSON LAST NAME " + personInfo.getPersonLastName());
        System.out.println("PERSON AGE "+ personInfo.getPersonAge());
        System.out.println("PERSON SALARY "+ personInfo.getPersonSalary());
        System.out.println("PASSPORT NUMBER "+ personInfo.getPassportRef().getPassportNumber());

        session.close();
    }
}
