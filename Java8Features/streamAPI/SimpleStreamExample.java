package Java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SimpleStreamExample {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5);

        stream.forEach(System.out::print);
        System.out.println();

        Stream<Integer> stream1 = Stream.of(new Integer[] {1,2,3,4,5});
        stream1.forEach(x -> System.out.print(x));
        System.out.println();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> squares = numbers.stream()
                .map(x -> x*x)
                .toList();
        System.out.println(STR."Numbers : \{numbers}");
        System.out.println("Squares :"+ squares);
    }
}
