package Java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MatchsInStream {

    static Predicate<String> pre =  x -> x.length()<2;

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple","Orange","banana","mango","goa");

        boolean allMatch = fruits.stream()
                .allMatch(pre);

        System.out.println("Do all the fruits string length is greater then 5? : "+allMatch);

        boolean anyMatch = fruits.stream()
                .anyMatch(pre);

        System.out.println("Do any of the fruits length is greater than 5 ? :"+anyMatch);

        boolean noneMatch = fruits.stream()
                .noneMatch(pre);

        System.out.println(noneMatch);
    }

}
