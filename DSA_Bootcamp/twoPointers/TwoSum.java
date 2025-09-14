package DSA_Bootcamp.twoPointers;

import java.util.Arrays;

public class TwoSum {

    static int[] twoSum(int[] nums, int target){

        int[] res = {0,0};

        int l =0;
        int r = nums.length-1;

        while(l<r){
            int sum = nums[l]+nums[r];
            if(sum == target){

                return new int[] {l,r};
            }
            else if(sum>target){
                r--;
            }
            else {
                l++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 5;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
