package gr.aueb.cf.ch15.abstract_classes;

/**
 * Teacher POJO (Plain Old Java Object) - Java Bean
 */
public class Student {
    private int id;
    private String firstname;
    private String lastname;
    private String region;

    public Student() {

    }

    public Student(int id, String firstname, String lastname, String region) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.region = region;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
