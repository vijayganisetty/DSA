public class CountInRotation {
    
    static int count(int[] nums)
    {
    int s=0;
    int e=nums.length-1;
    while(s<=e)
    {
        int mid=s+(e-s)/2;
     if(mid<e && nums[mid]>nums[mid+1])
     { 
        return mid;
     }
     else if(s<mid && nums[mid] <nums[mid-1])
     {
        return mid-1;
     }
     else if(nums[s]> nums[mid])
     {
        e=mid-1;
     }
     else
     {
        s=mid+1;
     }
    }
    return -1;
    }
    public static void main(String[] args)
    {
        int[] nums ={4,5,6,9,-1};
    int count=count(nums);
    System.out.println(count+1);
    }
}
