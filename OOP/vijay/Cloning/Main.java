package OOP.vijay.Cloning;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human vinay = new Human(21,"vinay");
//        Human twin = new Human(vinay);
//        System.out.println(vinay.age);
//        System.out.println(twin.age);

        Human twin = (Human) vinay.clone();
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(vinay.arr));


    }
}
