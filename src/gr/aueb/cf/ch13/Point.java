package gr.aueb.cf.ch13;

public class Point {
    private int x;
    private int y;

    private Point() {

    }

    /**
     * Static factory method.
     *
     * @return  a new Point instance.
     */
    public static Point getInstance() {
        return new Point();
    }
}
