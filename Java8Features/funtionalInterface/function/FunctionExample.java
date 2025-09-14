package Java8Features.funtionalInterface.function;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> fun = (s) -> s.toUpperCase();
    static Function<String, String> fun2 = (s) -> s.toUpperCase().concat(" 8 features");

    public static void main(String[] args) {

//        System.out.println(fun.apply("Hello"));
//
//        System.out.println(fun2.apply("Hello"));

        System.out.println(fun.andThen(fun2).apply("java"));
        System.out.println(fun.compose(fun2).apply("code"));
    }
}
