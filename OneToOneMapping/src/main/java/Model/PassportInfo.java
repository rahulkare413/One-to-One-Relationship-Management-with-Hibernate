package Model;

import javax.persistence.*;

@Entity
@Table(name = "PassportInfo")
public class PassportInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "passportIdGenerator")
    @SequenceGenerator(name = "passportIdGenerator",initialValue = 50000,allocationSize = 1000)
    @Column(name = "passportId")
    private int passportId;
    @Column(name = "passportNumber")
    private long passportNumber;
    @Column(name ="country")
    private String country;

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public long getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(long passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
