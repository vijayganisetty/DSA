package DSA_Bootcamp.prefixSum;

import java.util.Arrays;

public class BruteForce {

    public static void main(String[] args) {

        int[] nums ={1,2,3,4,5};
        int[] prefix = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int x = 0;
            for(int j=0;j<=i;j++){
                x += nums[j];
            }
            prefix[i] = x;
        }

        System.out.println(Arrays.toString(prefix));
    }
}
