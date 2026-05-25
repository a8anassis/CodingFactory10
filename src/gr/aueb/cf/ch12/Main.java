package gr.aueb.cf.ch12;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1L, "GR12345", "Anna", "Labrou", "AB123", 100);

        try {
            account.deposit(500);
            System.out.println("Η κατάθεση έγινε επιτυχώς");

            account.withdraw(100, "AB123");
            System.out.println("Η ανάληψη έγινε επιτυχώς");

            account.withdraw(1000, "AB999");
        } catch (Exception e) {
            System.out.println("Η λειτουργία απέτυχε");
        }
    }
}
