package gr.aueb.cf.ch15.abstract_classes;

/**
 * Teacher POJO (Plain Old Java Object) - Java Bean
 */
public class Teacher {
    private int id;
    private String firstname;
    private String lastname;
    private String subject;

    public Teacher() {

    }

    public Teacher(int id, String firstname, String lastname, String subject) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
