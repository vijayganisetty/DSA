package Java8Features.funtionalInterface.predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> lessThan = (a) -> (a<=50);
        Predicate<Integer> greaterThan = (a) -> (a>=50);
        Predicate<Integer> equalTo = (a) -> (a ==50);
   /*
        System.out.println(lessThan.test(55));
        System.out.println(greaterThan.test(55));
        System.out.println(equalTo.test(55));
     */

        boolean resultAnd = lessThan.and(greaterThan).and(equalTo).test(55);
        boolean resultOr = lessThan.or(greaterThan).or(equalTo).test(55);
        boolean resultNegate = lessThan.or(greaterThan).or(equalTo).negate().test(55);

        System.out.println(resultAnd);
        System.out.println(resultOr);
        System.out.println(resultNegate);
    }
}
