package DSA_Bootcamp.prefixSum;

import java.util.Arrays;

public class Optimized {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }
        System.out.println(Arrays.toString(prefix));

        // we can still optimize  as we are using extra space

    }
}
