package OOP.vijay.EncapsulationAndAbstraction;

import java.util.ArrayList;

public class Abstraction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);                      // these methods here we don't know the actual internal process
                                          // it hides the unnecessary details shows only important details
        System.out.println(arr.get(0));
    }
}
