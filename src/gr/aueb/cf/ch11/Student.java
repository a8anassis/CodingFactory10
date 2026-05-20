package gr.aueb.cf.ch11;

/**
 * Απλή data κλάση με τρία πεδία (fields).
 * Απλών και σύνθετων τύπων.
 */
public class Student {
    private int id;
    private String firstname;
    private String lastname;

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
