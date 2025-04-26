package SortingOfArray;

import java.util.Arrays;

public class CountSort {

    static int[] cSort(int[] nums){

        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max= nums[i];
            }
        }

        int[] arr = new int[max+1];

        for(int n:nums){
            arr[n]++;
        }

        int index=0;
        for(int i=0;i<=max;i++){
             while (arr[i]>0){
                 nums[index]=i;
                 index++;
                 arr[i]--;
             }
        }
        return  nums;
    }


    public static void main(String[] args) {
        int[] array = {4,3,2,2,1,5,8};

        System.out.println(Arrays.toString(cSort(array)));

    }

}
