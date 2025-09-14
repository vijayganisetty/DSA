package Java8Features.streamAPI.parallel;

import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {


        System.out.println(Runtime.getRuntime().availableProcessors());
        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .forEach(x-> System.out.println(x+"--"+ Thread.currentThread()));

        Stream.of(1,2,3,4,5,6,7,8,9,10)
                .parallel()
                .forEach(x-> System.out.println(x+"--"+ Thread.currentThread()));
    }
}
