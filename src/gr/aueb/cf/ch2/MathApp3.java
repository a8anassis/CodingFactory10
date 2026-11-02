package gr.aueb.cf.ch2;

/**
 * Math class demo.
 */
public class MathApp3 {

    public static void main(String[] args) {

        System.out.println(Math.min(1, 2));
        System.out.println(Math.max(1, 2));
        System.out.println(Math.abs(-3));

        int die = (int) (Math.random() * 6) + 1;
        System.out.println(die);
    }
}
