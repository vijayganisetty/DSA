package Collection.CollectionsHYR.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {


        LinkedList<Integer> llist = new LinkedList<>();

        for(int i=0;i<10;i++){
            llist.add(i*2);
        }

        llist.add(5,30);

        ArrayList<Integer> al = new ArrayList<>();
//        al.add(10);
//        al.add(20);
//        llist.addAll(al);
//        llist.addAll(0,al);
//        llist.remove();
//        llist.remove(1);
//        llist.removeAll(al);
//        llist.get(10);
//        llist.contains(20);
//        llist.containsAll(al);
//        llist.set(1,4);
        llist.clear();
        for(int i=1;i<=1000;i++){
            llist.add(i*2);
        }
        System.out.println(llist);
        llist.clear();
    }
}