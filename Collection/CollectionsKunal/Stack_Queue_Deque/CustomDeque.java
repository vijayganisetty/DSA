package Collection.CollectionsKunal.Stack_Queue_Deque;

public class CustomDeque {

    int[] data ;

    int front =0;
    int end =0;
    int size;
    final static int DEFAULT_SIZE = 10;

    public CustomDeque(){
        this(DEFAULT_SIZE);
    }

    public CustomDeque(int size){
        this.data = new int[size];
    }

    boolean isFull(){
        if(size==data.length){
            return true;
        }
        return  false;
    }

    boolean isEmpty(){
        return size ==0;
    }


    public  boolean insert(int item) throws Exception {
        if(isFull()){
throw  new Exception("queue is full");
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return  true;
    }

    public int remove() throws Exception {
        if(isEmpty()){
            throw new Exception("queue is empty");
        }
        int removed = data[front++];
        front = front%data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("queue is empty");
        }

        return data[front];
    }

    public void display() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }


        int i=front;

        do{
            System.out.print(data[i]+"->");
            i++;
            i = i%data.length;
        }
        while(i!=end);
        System.out.println("end");

    }

}
