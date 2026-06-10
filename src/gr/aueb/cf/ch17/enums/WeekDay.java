package gr.aueb.cf.ch17.enums;

public enum WeekDay {
    SUNDAY("Κυριακή"),
    MONDAY("Δευτέρα"),
    TUESDAY("Τρίτη"),
    WEDNESDAY("Τετάρτη"),
    THURSDAY("Πέμπτη"),
    FRIDAY("Παρασκευή"),
    SATURDAY("Σαββάτο");

    private final String day;

    WeekDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
}
