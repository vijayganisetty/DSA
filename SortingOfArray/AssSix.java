import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//problems on cycle sort 
public class AssSix {
    
    static int missingNumber(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            int in = nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[in])
            {
                    int temp = nums[i];
                    nums[i]=nums[in];
                    nums[in]= temp;
            }
            else i++;
            }
        
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j)
            {
                return j;
            }
        }
        return nums.length;
    }
     
    static List<Integer> disappearedNumbers(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            int in = nums[i]-1;
            if(nums[i]!=nums[in])
            {
                    int temp = nums[i];
                    nums[i]=nums[in];
                    nums[in]= temp;
            }
            else i++;
            }
        List<Integer> ans = new ArrayList<>(1);
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                ans.add(j+1);
            }
        }
        return ans;
    }

    static int duplicateNumber(int[] nums)
    {

        int i=0;
        while(i<nums.length)
        {   
            if(nums[i]!=i+1)
            {
           int correct=nums[i]-1;
            if(nums[i]!=nums[correct])
            {
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }
            else{
                return nums[i];
            }
        }
        else {
            i++;
        }
    } 
    return -1;  
    }

    static List<Integer> allDuplicateNumber(int[] nums)
    {  
        int i=0;
        while(i<nums.length)
        {
            int in = nums[i]-1;
            if(nums[i]!=nums[in])
            {
                    int temp = nums[i];
                    nums[i]=nums[in];
                    nums[in]= temp;
            }
            else i++;
        }
        System.out.println(Arrays.toString(nums));
        List<Integer> ans = new ArrayList<>(1);
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                ans.add(nums[j]);
            }
        }
        return ans;
  
    }

     static int[] misMatch(int[] nums)
    {  
        int[] ans={-1,-1};
        int i=0;
        while(i<nums.length)
        {
            int in = nums[i]-1;
            if(nums[i]!=nums[in])
            {
                    int temp = nums[i];
                    nums[i]=nums[in];
                    nums[in]= temp;
            }
            else 
            {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
              ans[0]=nums[j];
              ans[1]=j+1;

            }
        }
        return ans;
  
    }

    static int firstMissingPosition(int[] nums)
    {
         int i=0;
         while(i<nums.length)
         {
            int in = nums[i]-1;
            if(nums[i] >0 && nums[i]<=nums.length &&  nums[i]!=nums[in])
            {
                int temp=nums[i];
                nums[i]=nums[in];
                nums[in]=temp;
            }
            else{
                i++;
            }
         }
         for(int k=0;k<nums.length;k++)
         {
            if(nums[k]-1 !=k)
            {
                return k+1;
            
            }
         }
        return nums.length+1;
    }

    public static void main(String[] args)
    {

         int[] nums={7,8,9,11,12};
         System.out.println(firstMissingPosition(nums));
    }
}
