package gr.aueb.cf.ch3;

/**
 * Εμφανίζει 10 οριζόντια αστεράκια,
 * δηλαδή 1 αστεράκι 10 φορές.
 */
public class Stars10 {

    public static void main(String[] args) {

        int i = 1;
        int j = 10;

        while (i <= 10) {
            System.out.print("*");
            i++;
        }

        System.out.println();

        while (j >= 1) {
            System.out.print("*");
            j--;
        }
    }
}
