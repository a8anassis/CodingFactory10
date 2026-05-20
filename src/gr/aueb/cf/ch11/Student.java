package gr.aueb.cf.ch11;

/**
 * Java Bean - POJO (Plain Old Java Object)
 * Απλή data κλάση με τρία πεδία (fields).
 * Απλών και σύνθετων τύπων.
 */
public class Student {
    private static int studentCount;
    private int id;
    private String firstname;
    private String lastname;

    static {
        studentCount = 0;
    }

    // default constructor
    public Student() {          // parameter-less constructor ή no-arg constructor
        studentCount++;
    }

    // Overloaded constructor
    public Student(int id, String firstname, String lastname) {
        studentCount++;
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

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

    public static int getStudentCount() {
        return studentCount;
    }
}
