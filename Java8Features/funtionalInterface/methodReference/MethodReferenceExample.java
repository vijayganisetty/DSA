package Java8Features.funtionalInterface.methodReference;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceExample {

    // syntax ClassName :: methodName

    public static void main(String[] args) {
        System.out.println(MethodReferenceExample.compare(10,20));

        Comparator<Integer> comp = MethodReferenceExample::compare;

        System.out.println(comp.compare(10,20));

        List<String> stringList = Arrays.asList("one", "two", "three");

        stringList.forEach(System.out::println);

    }

    public static int compare(Integer x,Integer y){
        return Integer.compare(x,y);
    }
}
