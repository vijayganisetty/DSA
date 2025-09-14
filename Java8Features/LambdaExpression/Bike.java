package Java8Features.LambdaExpression;

import java.util.ArrayList;

public class Bike  {

    public static void main(String[] args) {
//        Vehicle v1 = ()-> {return 100;};
//        Vehicle v1 = ()-> 100;

        Vehicle v1 = ()-> 100;

       System.out.println( v1.getSpeed());

       ArrayList<Integer> arr =  new ArrayList<>();
       arr.add(10);
       arr.add(20);
       arr.forEach(x->System.out.println(x*2));

    }
}
