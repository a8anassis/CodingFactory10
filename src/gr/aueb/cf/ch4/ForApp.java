package gr.aueb.cf.ch4;

/**
 * Prints each iteration number inside
 * a for loop.
 */
public class ForApp {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }

    }
}
