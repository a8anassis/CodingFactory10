package gr.aueb.cf.ch17.enums;

public class Main {

    public static void main(String[] args) {
        UserRole userRole = UserRole.ADMIN;

        String userRoleStr = userRole.name();       // ADMIN
        UserRole userRole2 = UserRole.valueOf("ADMIN");

        for (UserRole role : UserRole.values()) {
            System.out.println(role.ordinal() + " - " + role.name());
        }

        for (WeekDay day : WeekDay.values()) {
            System.out.println(day.getDay());
        }
    }
}
