package Java8Features.funtionalInterface.function;

import java.util.function.BiFunction;

public class BifunctionExample {

    public static void main(String[] args) {

        BiFunction<String,String,Integer>  bifun =  (s,t) -> {
            int ret ;
            ret = s.length()+t.length();
            return ret;
        };

        BiFunction<String, String, Integer> bf2 = (s,t) -> {
            return s.length();
        };
        
        System.out.println(bifun.apply("java", "example"));

    }

}
