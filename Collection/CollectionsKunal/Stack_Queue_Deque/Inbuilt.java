package Collection.CollectionsKunal.Stack_Queue_Deque;

import java.util.*;

public class Inbuilt {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);


        Queue<Integer> queue = new LinkedList<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        Deque<Integer> deque = new ArrayDeque<>();





       // System.out.println(stack.pop());
       // System.out.println(stack);

        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);



    }
}
