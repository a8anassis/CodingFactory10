package gr.aueb.cf.ch11;

public class Customer {
    private long id;
    private String firstname;
    private String lastname;
    private String afm;
    private String phoneNumber;
    private String region;
    private String prefecture;
    private String city;
    private String street;
    private String streetNumber;
    private String zipCode;

    public Customer() {

    }

    public Customer(long id, String firstname, String lastname, String afm, String phoneNumber,
                    String region, String prefecture, String city, String street, String streetNumber, String zipCode) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.afm = afm;
        this.phoneNumber = phoneNumber;
        this.region = region;
        this.prefecture = prefecture;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
