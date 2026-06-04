package gr.aueb.cf.ch16.copy_constructor;

public class Student {
    private String name;
    private City city;

    public Student() {

    }

    public Student(String name, City city) {
        this.name = name;
        this.city = new City(city);
    }

    public Student(Student student) {
        this.name = student.name;
        this.city = new City(student.city);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return new City(city);
    }

    public void setCity(City city) {
        this.city = new City(city);
    }
}
