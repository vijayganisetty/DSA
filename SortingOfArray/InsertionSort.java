import java.util.Arrays;

public class InsertionSort {

    static int[] inSort(int[] nums)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(nums[j]<nums[j-1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
                else {
                    break;
                }
            }
        }
        return nums;
    }
    
    public static void main(String[] args)
    {
     int[] nums={2,3,1,5,4};
     System.out.println(Arrays.toString(inSort(nums)));
    }
}
