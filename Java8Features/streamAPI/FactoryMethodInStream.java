package Java8Features.streamAPI;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class FactoryMethodInStream {


    static UnaryOperator<Integer> unaryOperator = x -> x+5;

     static Supplier<Double> supplier = () -> Math.random()*10000;
    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.iterate(0,unaryOperator).limit(10);
        s1.forEach(x -> System.out.println(x));

        Stream<Double> s2 = Stream.generate(supplier).limit(10);
        s2.forEach(x -> System.out.println(x));

        Stream<Integer> s3 = Stream.of(1,2,3,4);
        s3.forEach(System.out::println);
    }
}
