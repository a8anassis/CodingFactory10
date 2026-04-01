package gr.aueb.cf.ch2;

/**
 * Expressions Demo
 * Pizza App Calculator.
 */
public class ExpressionsApp {

    public static void main(String[] args) {
        int friends = 4;
        int pizzasOrdered = 103;
        int slicesPerPizza = 8;

        int totalSlices = 0;
        int slicesPerPerson = 0;
        int leftoverSlices = 0;
        int aliceSlices = 0;

        int wallet = 50;
        int pizzaCost = 120;
        int drinkCost = 3;
        int totalBill = 0;
        int finalBill = 0;
        int costPerPerson = 0;
        int remainder = 0;
        int beforeArrival = 0;

        final int DISCOUNT = 10;    // 10% discount

        // Βασικές Πράξεις
        beforeArrival = friends++;      // beforeArrival -> 4 friends -> 5

        totalSlices = pizzasOrdered * slicesPerPizza;       // 24
        slicesPerPerson = totalSlices / friends;            // 4
        leftoverSlices = totalSlices % friends;             // 4

        aliceSlices = slicesPerPerson;
        --aliceSlices;                                      // έφαγε ένα κομμάτι -> 3

        // ===== Wallet Calculator =====
        wallet += 10;                           // wallet = wallet + 10;  Μας χρωστούσε ένας φίλος
        wallet -= 5;                            // wallet = wallet - 5;  Και εμείς χρωστούσαμε 5 ευρώ

        totalBill = (pizzasOrdered * pizzaCost) + (drinkCost * friends);
        finalBill = totalBill - (totalBill * DISCOUNT / 100);
        costPerPerson = finalBill / friends;
        remainder = finalBill % friends;

         System.out.printf("Κομμάτια: %d, Ανά άτομο: %d, Επιπλέον: %d, Alice: %d, Wallet: %d, Άτομα: %d%n",
                 totalSlices, slicesPerPerson, leftoverSlices, aliceSlices, wallet, friends);

        System.out.printf("Λογαριασμός: %,d, Με έκπτωση: %,d, Ανά άτομο: %,d, Επιπλέον: %d%n",
                totalBill, finalBill, costPerPerson, remainder);
    }
}
