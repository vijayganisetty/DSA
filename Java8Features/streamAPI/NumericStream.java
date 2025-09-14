package Java8Features.streamAPI;

import  java.util.List;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStream {

    public static void main(String[] args) {


        IntStream intStream = IntStream.range(1,6);

        System.out.println(intStream.sum());


        List<Integer> integerList = Arrays.asList(1,2,3,4,5);

        int sumUsingReduce = integerList.stream()
                  .reduce(0, (x,y) -> (x+y));
//This take more time as it converts Integer to int

        System.out.println("Sum using reduce : "+sumUsingReduce);

        int sumUsingIntStrm = integerList.stream()
                .mapToInt(x-> x.intValue())
                .sum();
        System.out.println("Sum using Int Stream : "+ sumUsingIntStrm);

        LongStream longStream = LongStream.range(1,20);

        long ans = longStream.max().getAsLong();
        System.out.println(ans);

        //boxing   primitive  to wrapper
        List<Integer> intlist = IntStream
                .rangeClosed(1,20)  // primitive
                .boxed() // primitive to wrapper
                .collect(Collectors.toList());  // collecting to list
        intlist.forEach(System.out::println);

        // Un boxing --> wrapper to primitive
        int sum = Arrays.asList(1,2,3,4,5)  // wrapper
                .stream()
                .mapToInt(x -> x.intValue())   // to primitive
                .sum();   //sum
        System.out.println(sum);
    }
}
