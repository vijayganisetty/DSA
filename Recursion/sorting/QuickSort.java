package Recursion.sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {


    static void qSort(int[] nums,int l,int h)
    {
        if(l>=h)
        {
            return ;
        }
        int s=l;
        int e=h;
        int mid=s+(e-s)/2;
        int pivot=nums[mid];

        while(s<=e)
        {
            while(nums[s]<pivot)
            {
                s++;
            }
            while(nums[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        qSort(nums, l, e);
        qSort(nums, s, h);

    }

    public static void main(String[] args)
    {

        int[] arr = {5,4,3,2,1};

        qSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
       

    }
    
}
