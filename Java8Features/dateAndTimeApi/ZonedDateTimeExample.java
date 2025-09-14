package Java8Features.dateAndTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        // Represents date and time in zone

        ZonedDateTime now = ZonedDateTime.now();
        ZoneId zoneNow = ZonedDateTime.now().getZone();

        ZonedDateTime custom = ZonedDateTime.of(2025,5,1,21,30,55,3, ZoneId.of("America/New_York"));

        ZonedDateTime newYorkNow = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println(zoneNow);
        System.out.println(now);
        System.out.println(custom);
        System.out.println(newYorkNow);
    }
}
