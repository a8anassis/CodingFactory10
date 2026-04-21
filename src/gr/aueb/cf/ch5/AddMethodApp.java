package gr.aueb.cf.ch5;

public class AddMethodApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a, b);

        System.out.println("Το άθροισμα είναι: " + sum);
    }

    public static int add(int a, int b) {
//        // Δήλωση και αρχικοποίηση
//        int sum = 0;
//
//        // Επεξεργασία
//        sum = a + b;
//
//        // Επιστροφή αποτελέσματος
//        return sum;

        return a + b;
    }
}
