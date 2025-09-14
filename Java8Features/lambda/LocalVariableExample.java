package Java8Features.lambda;

import java.util.function.Consumer;

public class LocalVariableExample {

    static int k = 0;

    public static void main(String[] args) {
        int i = 10;

        Consumer<Integer> c1 = (x) -> {
            System.out.println(x+i);
            System.out.println(++k);
        };

        c1.accept(15);
    }

}
