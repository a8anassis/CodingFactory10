package gr.aueb.cf.ch15.special_interfaces;

public class Main {

    public static void main(String[] args) {
        IProduct book = new Book();
        CompactDisk cd = new CompactDisk();

        deliver(book);
        deliver(cd);
    }

    public static void deliver (IProduct product) {
        if (product instanceof Book) {
            System.out.println("Delivering book...");
        } else if (product instanceof CompactDisk) {
            System.out.println("Delivering CD...");
        } else {
            throw new IllegalArgumentException("Invalid product type");
        }
    }
}
