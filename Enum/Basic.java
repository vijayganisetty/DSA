package Enum;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Basic {

    enum Week {
        mon, tue, wed, thu, fri, sat, sun;

//        Week() {
//            System.out.println("Constructor");
//        }
        }

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();
        Enumeration<Integer> e = v.elements();
        boolean b=e.hasMoreElements();
        e.nextElement();

        ArrayList<Integer> a = new ArrayList<>();
        Iterator<Integer> i = a.iterator();
        i.next();
        boolean val = i.hasNext();
        i.remove();


        Week week;
        week = Week.mon;
        System.out.println(week);
//        for (Week day :Week.values()){
//            System.out.println(day);
//        }
//
//        System.out.println(week);
//        System.out.println(week.ordinal());
    }
}
