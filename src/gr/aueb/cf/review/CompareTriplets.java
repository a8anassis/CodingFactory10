package gr.aueb.cf.review;

/**
 * Δίνονται ως είσοδος δύο πίνακες - ένας για την Αlice και ένας για τον Bob -
 * που περιέχουν 3 βαθμολογίες ο καθένας σε 3 μαθήματα (Μουσική, Μαθηματικά, Φυσική).
 * Κάθε βαθμός μπορεί να είναι από 1 .. 100
 *
 * Αν η Alice έχει μεγαλύτερη βαθμολογία σε ένα μάθημα, παίρνει 1 πόντο.
 * Αν ο Bob έχει μεγαλύτερη βαθμολογία σε ένα μάθημα, παίρνει αυτός τον 1 πόντο
 * Αν είναι ίσοι οι βαθμοί κανείς δεν παίρνει πόντο.
 *
 * Επιστρέφει πίνακα με 2 θέσεις  [πόντοι Alice, πόντοι Bob]
 */
public class CompareTriplets {

    public static void main(String[] args) {
        int[] alice = { 50, 61, 79 };
        int[] bob = { 39, 65, 100 };
        int[] points;

        points = compareTriplets(alice, bob);

        System.out.println("Alice points: " + points[0] +
                ", Bob points: " + points[1]);

    }

    public static int[] compareTriplets(int[] a, int[] b) {
        int[] points = new int[2];  // populate στο 0

        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) points[0]++;
            else if (a[i] < b[i]) points[1]++;
        }
        return points;
    }
}
