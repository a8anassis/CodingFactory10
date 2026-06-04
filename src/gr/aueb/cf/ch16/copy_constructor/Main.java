package gr.aueb.cf.ch16.copy_constructor;

public class Main {

    public static void main(String[] args) {
        City athens = new City("Athens");
        City copyAthens = new City(athens);
    }
}
