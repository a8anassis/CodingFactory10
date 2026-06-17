package gr.aueb.cf.solutions.ch15;

public class Rectangle extends AbstractShape implements ITwoDimensional {
    private double width;
    private double height;

    @Override
    public double getArea() {
        return width * height;
    }
}
