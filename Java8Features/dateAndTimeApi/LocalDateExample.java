package Java8Features.dateAndTimeApi;

import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {
        // Represents a date without time

        LocalDate today = LocalDate.now();

        LocalDate myDate = LocalDate.of(2025,11,11);

        System.out.println(today);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.minusDays(1));
        System.out.println(today.minusMonths(2));

        System.out.println(today.isLeapYear());
    }
}
