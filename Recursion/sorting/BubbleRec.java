package sorting;

import java.util.Arrays;

public class BubbleRec {

    static void bSort(int[] num,int l,int i)
    {
        if(l==0)
        {
            return;
        }
        if(i<l)
        {
            if(num[i]>num[i+1])
            {
                    int temp=num[i];
                    num[i]=num[i+1];
                    num[i+1]=temp;
            }
            bSort(num, l, i+1);

        }
        else{
            bSort(num, l-1,0);
           }
    }
 
    static int[] bubbleSort(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }
        }
        return nums;
    }

    public static void main(String[] args)
    {

        int[] arr={4,3,2,1};
        bSort(arr, arr.length-1,0 );
        int[] a= bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.print(Arrays.toString(a));
    }
    
}
