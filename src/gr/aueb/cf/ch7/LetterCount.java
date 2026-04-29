package gr.aueb.cf.ch7;

/**
 * Δημιουργήστε μία μέθοδο, που να παίρνει ως είσοδο
 * ένα sting και ένα char και να επιστρέφει το πλήθος των
 * εμφανίσεων του char στο string.
 *
 * s[2] -> s.charAt(2)
 */
public class LetterCount {

    public static void main(String[] args) {

    }

    // Μέθοδος
    public static int getLetterCount(String s, char letter) {
        if (s == null) return -1;

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

}
