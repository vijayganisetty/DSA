package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java7vsJava8 {

    public static void main(String[] args) {

        // Before

        int total = 0;
        for(int i=0;i<=50;i++){
            total += i;
        }
        System.out.println("Total in java7 "+ total);

        // after

        int total1 = IntStream.rangeClosed(0, 50)
                .map(Integer :: new)
                .sum();
        System.out.println("Total in java8 "+ total1);

        //Before

        List<String> names = Arrays.asList("Sam", "Peter","Sam");
        List<String> uniqueNames = new ArrayList<>();

        for (String name : names){
            if(!uniqueNames.contains(name)){
                uniqueNames.add(name);
            }
        }
        System.out.println(uniqueNames);

        List<String> uniqueNames1 = names.parallelStream()
                .distinct()
                .toList();

        System.out.println(uniqueNames1);
    }
}
