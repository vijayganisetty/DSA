import java.util.Arrays;

public class BubbleSort {
     
    static int[] bSort(int[] nums)
    {
        boolean swap;
        for(int i=0;i<nums.length;i++)
        {
            swap=false;
            for(int j=1;j<nums.length-i;j++)
            {
                
                if(nums[j]<nums[j-1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swap=true;
                }  
            }
            if(swap==false)
            {
                break;
            }
             
        }
        return nums;
    }
    static int[] bubblesort(int[] num )
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=0;j<num.length-i-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        return num;

    }

    public static void main(String[] args)
    {
        int[] nums={1,3,-1,0,-10};
    System.out.println(Arrays.toString(bSort(nums)));
    }

}
