package Collection.CollectionsHYR.Stack;

import java.util.*;

public class StackBase {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        for(int i=1;i<10;i++){
            st.push(i*2);
        }

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.search(16));
    }
}
