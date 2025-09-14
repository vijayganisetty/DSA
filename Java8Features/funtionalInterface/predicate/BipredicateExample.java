package Java8Features.funtionalInterface.predicate;

import java.util.Objects;
import java.util.function.BiPredicate;

public class BipredicateExample {

    static BiPredicate<Integer, Integer> bipe = (a,b) -> (Objects.equals(a, b));

    public static void main(String[] args) {

        System.out.println(bipe.test(10,10));
    }
}
