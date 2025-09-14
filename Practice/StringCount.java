package Practice;

import java.util.HashMap;

public class StringCount {

    static int get(String skills){

        char[] charArr = skills.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();


        map.put('p',0);
        map.put('c',0);
        map.put('m',0);
        map.put('b',0);
        map.put('z',0);

        for( char c : charArr){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int min = Integer.MAX_VALUE;
        for( int c : map.values()){
            if(c < min){
                min = c;
            }

        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(get("bbbbcccmmmmppppzzzz"));
    }

}
