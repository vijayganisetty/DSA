package Recursion.searching;

public class BinaryRecur {
    
    static int binarySearch(int[] nums,int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        if(target<nums[mid])
        {
            return binarySearch(nums, target, s, mid-1);
        }
   
         return binarySearch(nums, target, mid+1,e);
    }
    public static void main(String[] args)
    {
     int[] nums={1,2,3,4,5,6,7};
     System.out.print(binarySearch(nums, 5, 0,nums.length-1));
    }
}
