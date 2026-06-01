package gr.aueb.cf.solutions.ch11;

public class UserMain {

    public static void main(String[] args) {

        User user = new User(1L, "George", "Alexander");

        System.out.printf("{id: %d, firstname: %s, lastname: %s}", user.getId(),
                user.getFirstname(), user.getLastname());
    }
}
