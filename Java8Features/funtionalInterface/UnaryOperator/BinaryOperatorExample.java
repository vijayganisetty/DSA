package Java8Features.funtionalInterface.UnaryOperator;


import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {



    static Comparator<Integer> comp = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {

        BinaryOperator<Integer> bo1 = BinaryOperator
                .maxBy((a, b) -> (a > b) ? 1 : (a == b) ? 0 : -1);

        BinaryOperator<Integer> bo2 = BinaryOperator
                .maxBy(comp);

        BinaryOperator<Integer> bo3 = BinaryOperator
                .minBy(comp);

        System.out.println(bo1.apply(1,2));

        System.out.println(bo2.apply(1,2));

        System.out.println(bo3.apply(1,2));
    }
}
