package gr.aueb.cf.ch16.equals_hashcode;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(15, 20);

        System.out.println(p1.equals(p2));  // true
        System.out.println(p1.equals(p3));  // false
    }
}
