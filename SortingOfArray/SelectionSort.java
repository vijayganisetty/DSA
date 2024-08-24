package SortingOfArray;

import java.util.Arrays;

public class SelectionSort {
    
    static int[] sSort(int[] nums)
    {

        for(int i=0;i<nums.length;i++)
        {
            int last =nums.length-i-1;
            int maxEle =getMaxEle(nums,0,last);
            swap(nums,maxEle,last);

        }
        return nums;
    }
  static  int getMaxEle(int[] nums , int start ,int end)
    {
       int max=start;
       for(int i=start;i<=end;i++)
       {
        if(nums[i]>nums[max])
        {
            max=i;
        }
       }
       return max;
    }

    static void swap(int[] nums,int f,int s)
    {
        int temp=nums[f];
        nums[f]=nums[s];
        nums[s]=temp;
    }
    public static void main(String[] args)
    {
        int[] nums={5,4,1,2,3};
        System.out.println(Arrays.toString(sSort(nums)));

    }
}
