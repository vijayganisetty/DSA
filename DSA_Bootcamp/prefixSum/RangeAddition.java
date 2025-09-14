package DSA_Bootcamp.prefixSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RangeAddition {

    // Do n operation such as incrementing all the elements by x in the range

    public static void main(String[] args) {

        int[] arr = new int[6];

        int[] diff = new int[6];

        //opp 1 add 10 to range [1,3];

        diff[1] += 10;
        diff[4] -= 10;

        // opp 2 add 5 to range[2,5];

        diff[2] += 5;

        // diff[6]-= 5; skipping as index out of range;

        arr[0] = diff[0];

        for(int i = 1; i<arr.length;i++){

            arr[i] = arr[i-1] + diff[i];
        }

        System.out.println(Arrays.toString(arr));

    }
}
