package Model;

import javax.persistence.*;

@Entity
@Table(name = "PersonInfo")
public class PersonInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "personId")

    private int personId;
    @Column(name = "personFirstName")
    private String personFirstName;
    @Column(name = "personLastName")
    private String personLastName;
    @Column(name = "personAge")
    private int personAge;
    @Column(name = "personSalary")
    private double personSalary;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passportRef")
    private PassportInfo passportRef;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public double getPersonSalary() {
        return personSalary;
    }

    public void setPersonSalary(double personSalary) {
        this.personSalary = personSalary;
    }

    public PassportInfo getPassportRef() {
        return passportRef;
    }

    public void setPassportRef(PassportInfo passportRef) {
        this.passportRef = passportRef;
    }
}
