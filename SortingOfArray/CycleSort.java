import java.util.Arrays;

public class CycleSort {
    
    static int[] sorting(int[] nums)
    {

        int i=0;
        while(i<nums.length)
        {
           int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                i++;
            }
        }
        return nums;
    }

    public static void main(String[] args)
    {
    int[] nums={3,2,1};
    System.out.println(Arrays.toString(sorting(nums)));
    }
}
