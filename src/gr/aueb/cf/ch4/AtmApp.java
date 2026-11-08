package gr.aueb.cf.ch4;

import java.util.Scanner;

public class AtmApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 500;
        int choice = 0;
        int amount = 0;

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Ανάληψη");
            System.out.println("2. Κατάθεση");
            System.out.println("3. Έξοδος");
            System.out.print("Επιλογή: ");

            choice = sc.nextInt();

            if  (choice == 3) {
                System.out.println("Επιλέξατε έξοδο ...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Εισάγετε ποσό ανάληψης: ");
                    amount = sc.nextInt();

                    if (amount <= 0) {
                        System.out.println("Το ποσό πρέπει να είναι θετικό.");
                        continue; // Λειτουργεί κανονικά! Γυρίζει στην αρχή του while.
                    }

                    if (amount > balance) {
                        System.out.println("Ανεπαρκές υπόλοιπο!");
                        continue; // Λειτουργεί κανονικά και εδώ!
                    }

                    balance -= amount;
                    System.out.println("Νέο υπόλοιπο: " + balance + "\\u20AC");
                    break; // Βγαίνει μόνο από το switch
                case 2:
                    System.out.print("Εισάγετε ποσό κατάθεσης: ");
                    amount = sc.nextInt();

                    if (amount <= 0) {
                        System.out.println("Το ποσό πρέπει να είναι θετικό.");
                        continue; // Λειτουργεί κανονικά!
                    }

                    balance += amount;
                    System.out.println("Νέο υπόλοιπο: " + balance + "\\u20AC");
                    break;
                default:
                    System.out.println("Λάθος επιλογή.");
                    break;
            }
        }
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή.");
    }
}
