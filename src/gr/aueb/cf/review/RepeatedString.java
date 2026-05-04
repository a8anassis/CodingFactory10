package gr.aueb.cf.review;

/**
 * Δοθέντος ενός string, επιστρέφει ένα string
 * που αποτελεί επανάληψη του αρχικού string, n φορές.
 *
 * Για παράδειγμα, αν το αρχικό string είναι το abc και
 * το n = 3, τότε επιστρέφει abcabcabc.
 */
public class RepeatedString {

    public static void main(String[] args) {
        String s = "abc";
        int n = 3;
        String result;

        result = repeatedString(s, n);
        System.out.println(result); // Αναμένεται: abcabcabc
    }

    public static String repeatedString(String s, int n) {
        if (s == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        if (n < 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder(s.length() * n);

        sb.repeat(s, n);
        return sb.toString();
    }
}
