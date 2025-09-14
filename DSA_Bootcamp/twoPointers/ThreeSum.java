package DSA_Bootcamp.twoPointers;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    //Return all the three different triplets indexes whose sum is zero

    static List<List<Integer>> threeSum(int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int end = nums.length-2;
        for(int i=0;i<end;i++){

            if(i>0 && (nums[i]== nums[i-1])) continue;
            int l = i+1;
            int r = nums.length-1;
            while (l<r){
                int sum = nums[l]+nums[r]+nums[i];
                if (sum==0){
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[l]);
                    res.add(nums[r]);
                    result.add(res);
                    while (l<r && nums[l]==nums[l+1]) l++;
                    while (l<r && nums[r]==nums[r-1]) r--;
                    l++;
                    r--;
                }
                else if (sum>0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return result ;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans =  threeSum(nums);

        for (List<Integer> li: ans){
            System.out.println(li);
        }
    }
}
