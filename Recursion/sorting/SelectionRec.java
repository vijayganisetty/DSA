package sorting;

import java.util.Arrays;

public class SelectionRec {
    
    static void sSort(int[] nums,int l,int i,int m)
    {
        if(l==0)
        {
            return;
        }
        if(i<l)
        {
            if(nums[i]>nums[m])
            {
                sSort(nums, l, i+1, i);
            }
            else{
                sSort(nums, l, i+1, m);
            }

        }
        else{
            int temp = nums[m];
            nums[m] = nums[l-1];
            nums[l-1]=temp;
            sSort(nums, l-1, 0,0);

        }

    }

    public static void main(String[] args)
    {

        int[] arr ={4,3,2,1};
        sSort(arr, arr.length, 0, 0);
        System.out.print(Arrays.toString(arr));

    }
}
