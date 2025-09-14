package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class BitCountArray {


    static int[]  byteCount(int n){

        String byteValue = Integer.toBinaryString(n);

        int[] byteArray = new int[byteValue.length()];

        for(int i=0;i<byteValue.length();i++){
            byteArray[i] = byteValue.charAt(i);
        }

        int count = 0;

        for(int k : byteArray){
            if(k==49){
                count++;
            }
        }
        ArrayList<Integer> helperArray = new ArrayList<>();
        helperArray.add(count);
        for(int i=0;i<byteArray.length;i++){
            if(byteArray[i]==49){
                helperArray.add(i+1);
            }
        }

        int[] result = new int[count+1];

        for(int i =0 ;i<helperArray.size();i++) {
            result[i] = helperArray.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(byteCount(37)));
    }
}
