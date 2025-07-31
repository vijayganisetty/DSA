package Java8Features.streamAPI;

import java.util.Arrays;
import java.util.List;

public class StreamBasic {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);

        List<Integer> squares = numbers.stream()
                .map(x -> x*x)
                .toList();
        System.out.println(STR."Numbers : \{numbers}");
        System.out.println("Squares :"+ squares);
    }
}
