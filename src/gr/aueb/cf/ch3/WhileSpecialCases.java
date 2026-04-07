package gr.aueb.cf.ch3;

/**
 * Special Cases of While.
 * 1. Zero iterations
 * 2. One iteration
 * 3. Eternal loop
 */
public class WhileSpecialCases {

    public static void main(String[] args) {
        int i = 1;

        // 1. Zero iterations
        while (i <= 0) {
            System.out.println("i = " + i);
            i++;
        }

        // 2. One iteration
        while (i <= 1) {
            System.out.println("i = " + i);
            i++;
        }

        // 3. Eternal loop
        while (true) {
            System.out.println("Είμαι σε έναν αιώνιο βρόχο (eternal loop)!");
        }
    }
}
