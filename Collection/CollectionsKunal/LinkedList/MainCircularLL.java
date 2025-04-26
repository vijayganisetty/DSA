package Collection.CollectionsKunal.LinkedList;

public class MainCircularLL {

    public static void main(String[] args) {
        CircularLL list = new CircularLL();

        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(30);
        list.insertFirst(46);
        list.insertFirst(8);
        list.deleteFirst();
        list.delete(30);
        list.display();

    }
}
