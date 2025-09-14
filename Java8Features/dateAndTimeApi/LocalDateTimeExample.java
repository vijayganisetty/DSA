package Java8Features.dateAndTimeApi;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        LocalDateTime custom = LocalDateTime.of(2024,11,15,22,33,30);

        LocalDateTime parsed = LocalDateTime.parse("2024-11-15T22:33:30");

        System.out.println(now);

        System.out.println(custom);
        System.out.println(parsed);

        System.out.println(parsed.isAfter(now));
    }
}
