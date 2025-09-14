package DSA_Bootcamp.twoPointers;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] nums  =  {0,1,14,8,0,10};
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[k]= nums[i];
                k++;
            }
        }
        while(k<nums.length){
            nums[k] = 0;
            k++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
