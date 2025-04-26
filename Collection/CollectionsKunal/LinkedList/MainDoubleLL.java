package Collection.CollectionsKunal.LinkedList;

public class MainDoubleLL {

    public static void main(String[] args) {

        DoubleLL list = new DoubleLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(1);
        list.insertFirst(24);
        list.insertLast(8);
       list.insertAfter(20,25);
        System.out.println(list.deleteFirst());
        list.display();
//        System.out.println();
//        list.displayrev();

    }


}
