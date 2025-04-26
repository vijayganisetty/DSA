package BinearSearch;
public class peakInMountain {
    //mountain array is { 0,1,2,3,2,1,0};
      //      3
     //     2    2
    //    1       1
    //  0          0
    //here 3 is the peak

    // we can also find max of array can be the same as peak index of Mountain array also called as bitonic array
    //perform binary search and if n greater than n+1 then  change end to  id;
    // {0,1,2,3,2,1,0} here 3 is geater than e=mid
    //{0,1,2,3} here mid = 1 , 1!>3 so the other case s = mid+1;
    //{2,3}  here mid =2 , 2!>3 so the case s = mid+1;
    // {3} here mid=3, 3!>3 so the case s = mid+1;
    // s=mid=e=3 and it is the peak of the arraay
    static int peakIndex(int[] nums)
    {
       int s=0;
       int e=nums.length-1;
       while(s<e)
       {
           int mid=s+(e-s)/2;
           if(nums[mid]>nums[mid+1])
           {
               e=mid;
           }
           else{
               s=mid+1;
           }
       }
       return s;
    }
    public static void main(String[] args)
    {
      int[] nums={1,3,4,5,7,4,2,};
      System.out.println(peakIndex(nums));
    }
}
