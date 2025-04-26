package Collection.CollectionsHYR.Map;

import java.util.*;

public class MapBase {

    public static void main(String[] args) {

        Map<Integer,String> m = new Hashtable<>();
        m.put(2,"vijay");
        m.put(1,"rahul");
        Set<Integer> keys = m.keySet();
        for(Integer key : keys){
            System.out.println(key);
        }
        Collection<String> values = m.values();

        System.out.println(values);

        String str="abdgugffuygsfagb";
        char[] chr = str.toCharArray();
        int[] arr = {1,2,3,4,5,5,3,2};

         HashMap<Character,Integer> map = new HashMap<>();

         for(Character n :chr){
             map.put(n, map.getOrDefault(n,0)+1);
         }
        map.forEach((k,v)-> System.out.println(k+" "+v));

         Map<Integer,Integer> tm = new TreeMap<>();
        tm.put(2,10);
         tm.put(1,7);

        System.out.println(tm);
    }

}
