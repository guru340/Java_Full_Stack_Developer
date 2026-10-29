package DateAndTime;

import java.time.LocalDate;

public class Localdt {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());

        LocalDate date = LocalDate.of(2026, 12, 25);
        System.out.println(date);
    }
}