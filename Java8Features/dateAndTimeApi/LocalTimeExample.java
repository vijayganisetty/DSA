package Java8Features.dateAndTimeApi;

import java.time.LocalTime;

public class LocalTimeExample {


    public static void main(String[] args) {

        // Represents  time without date

        LocalTime now = LocalTime.now();

        LocalTime customTime = LocalTime.of(10,10,35);

        LocalTime parsedTime = LocalTime.parse("23:25:59");

        LocalTime beforeOneHour = now.minusHours(1);

        System.out.println(now);
        System.out.println(customTime);
        System.out.println(parsedTime);
        System.out.println(beforeOneHour);
    }
}
