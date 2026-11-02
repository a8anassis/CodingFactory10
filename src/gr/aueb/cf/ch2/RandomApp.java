package gr.aueb.cf.ch2;

/**
 * Παράγει ένα τυχαίο ακέραιο μεταξύ 1 - 6 (ζάρι).
 *  (max - min + 1) + min
 *     Math.random() → [0, 1)
 *     (max - min + 1) → [0, n), όπου n = πλήθος δυνατών τιμών
 *     cast/floor → ακέραιος στο 0 … n−1
 *     + min → μετατόπιση στο min … max
 */
public class RandomApp {

    public static void main(String[] args) {
        int die = 0;

        die = (int) (Math.random() * 6 - 1 + 1) + 1;   // max - min + 1  + min

        System.out.println(die);
    }
}
