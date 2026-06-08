package gr.aueb.cf.ch17.lifo_parking;

public class Main {

    public static void main(String[] args) {
        LifoParking lifoParking = new LifoParking();

        lifoParking.addCar("ΙΑΕ 2323");
        lifoParking.addCar("ΖΑΟ 1391");
        lifoParking.addCar("ΧD 3444");

        String car = lifoParking.removeCar();
//        System.out.println(car);

        car = lifoParking.removeCar();
//        System.out.println(car);

        lifoParking.traverse();
    }
}
