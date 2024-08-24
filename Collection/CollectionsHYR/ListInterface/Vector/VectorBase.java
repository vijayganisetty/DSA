package Collection.CollectionsHYR.ListInterface.Vector;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class VectorBase {


    public static void main(String[] args) {

        Object[] list = new Object[]{1,2,3,4};
        Vector v2 = new Vector(Arrays.asList(list));

        Vector<Integer>  v1 = new Vector<>();
        for(int i =0;i<13;i++){
            v1.add(i*2);
        }
        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.capacity());


    }

}
