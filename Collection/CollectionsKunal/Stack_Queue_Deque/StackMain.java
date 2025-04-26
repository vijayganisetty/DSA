package Collection.CollectionsKunal.Stack_Queue_Deque;

public class StackMain {


    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
//        stack.push(50);
//        System.out.println(stack.pop()+" popped from stack");
//
//        stack.display();

        DynamicStack dstack = new DynamicStack(5);

        dstack.push(10);
        dstack.push(20);
        dstack.push(30);
        dstack.push(10);
        dstack.push(20);
        dstack.push(30);

        dstack.display();
    }



}
