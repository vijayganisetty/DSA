package Java8Features.dateAndTimeApi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class InstantExample {

    public static void main(String[] args) {

        //Instant
        // Represents system instantaneous timeline
        long UTCNow = System.currentTimeMillis();
        Instant now = Instant.now();
        System.out.println(now);

        //Duration
        // time difference blw two times
        Duration due = Duration.between(now, now.minusSeconds(23));

        System.out.println(due);


        Instant start = Instant.now();

        for(int i=0;i<10;i++){
            int n = 5;
        }
        Instant end  = Instant.now();

        System.out.println(Duration.between(start,end));

        //Period
        //Represents period of time blw two dates;
        LocalDate dateNow = LocalDate.now();

        LocalDate dateThen = LocalDate.of(2025,4,22);

        Period period = Period.between(dateNow,dateThen);
        System.out.println(period);

        //DateTimeFormatter
        //formats, parses dates and times
        LocalDate localDate = LocalDate.parse("2025-09-05");
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("2025-9-10");

        System.out.println(dateTimeFormatter);

        String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(date);

        String anotherDate = "12/05/1997";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date1 = LocalDate.parse(anotherDate,formatter);

        System.out.println(date1);

    }
}
