package Java8Features.funtionalInterface.UnaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorsExample {

    static UnaryOperator<String> uo = (name) -> name.toUpperCase();

    static UnaryOperator<Integer> uo1 = (i)  ->  i + 25;
    public static void main(String[] args) {

        System.out.println(uo.apply("java8"));

        System.out.println(uo1.apply(23));
    }
}
