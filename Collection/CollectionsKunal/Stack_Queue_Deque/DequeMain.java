package Collection.CollectionsKunal.Stack_Queue_Deque;

public class DequeMain {

    public static void main(String[] args) throws Exception {

        CustomDeque deque = new CustomDeque(10);

        deque.insert(10);
        deque.insert(20);
        deque.insert(30);
        deque.insert(40);
        deque.insert(50);

        deque.display();

        deque.remove();

        deque.display();

        deque.insert(10);

        deque.display();

    }
}


