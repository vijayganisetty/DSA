package Collection.CollectionsKunal.Stack_Queue_Deque;

public class QueueMain {

    public static void main(String[] args) throws Exception {

        CustomQueue queue = new CustomQueue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        queue.display();

        queue.remove();

        queue.display();

        queue.insert(10);

        queue.display();
    }
}
