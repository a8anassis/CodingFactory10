package gr.aueb.cf.ch15.abstract_classes.school;

public class Teacher extends AbstractActor {
    private String subject;

    public Teacher() {

    }

    public Teacher(long id, String firstname, String lastname, String subject) {
        super(id, firstname, lastname);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
