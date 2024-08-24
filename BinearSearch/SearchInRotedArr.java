package BinearSearch;
public class SearchInRotedArr {
    //only for sorted rotated array with no duplicates
    static int binaryForPivot(int[] nums,int n,int s,int e)
  {
    while(s<=e)
    {
        int mid=s+(e-s)/2;
        if(n==nums[mid])
        {
            return mid;
        }
        else if(n>nums[mid])
        {
            s=mid+1;
        }
        else{
            e=mid-1;
        }
    }
    return  -1;

  }
     static int findPivot(int nums[])
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
         else if(mid>s && nums[mid]<nums[mid-1])
         {
            return mid-1;
         }
         else if(nums[mid] <=nums[s])
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
    int[] nums={2,3,4,5,8,0,1};
    int pivot = findPivot(nums);
    int n=8;
    int f=binaryForPivot(nums, n,0, pivot);
    if(pivot==-1)
    {
       System.out.println(binaryForPivot(nums, n, 0, nums.length-1));
    }
    else if(nums[pivot]==n)
    {
        System.out.println(pivot);
    }
    else if(n>nums[0])
    {
        System.out.println(binaryForPivot(nums, n,0,pivot));
    }
    else
    {
        System.out.println(binaryForPivot(nums, n, pivot+1,nums.length-1)); 
    }
    }
} 
