package gr.aueb.cf.ch14;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(15.1);
        Point2D p2 = new Point2D(15.1, 20.2);
        Point3D p3 = new Point3D(15.1, 20.2, 30.3);

        Point p4 = new Point2D(15.1, 20.2);
        Point p5 = new Point3D(15.1, 20.2, 30.3);

//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);


        p1.movePlusOne();
        p2.movePlusOne();
        p3.movePlusOne();

        doMovePlusOne(p1);
        doMovePlusOne(p2);
        doMovePlusOne(p3);
        doMovePlusOne(p4);
        doMovePlusOne(p5);

        doPrint(p1);
        doPrint(p2);
        doPrint(p3);
        doPrint(p4);
        doPrint(p5);
    }

    // Polymorphism
    public static void doMovePlusOne(Point p) {
        p.movePlusOne();        // late binding
    }

    public static void doPrint(Point p) {
        System.out.println(p.toString());
    }


}
