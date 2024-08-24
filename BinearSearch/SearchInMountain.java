package BinearSearch;
public class SearchInMountain {
    
    //let a={1,2,3,4,5,4,3,2,1}
    //by using peakofmountain we get the two halfs of array 
    // a={1,2,3,4,5} and a={4,2,1}
    //if first element if less then peak use binary search with ascending order
    //else use binary search with decending

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
    static int orderAgnostic(int[] nums,int n,int x,int y)
   {
       boolean isAsc=nums[x]<nums[y];
       while(x<=y)
       {
           int mid=x+(y-x)/2;
            if(n==nums[mid])
            {
               return mid;
            }
       if(isAsc)
       {   
           if(n>nums[mid])
           {
           x=mid+1;  
           }
           else
           {
               y=mid-1;
           }
       }
       else{
           if(n<nums[mid])
           {
            x=mid+1;   
           }
           else{
              y=mid-1;
           }
       }
      }
      return -1;
   }

   static int searchMountain(int[] nums,int n)
   {
      int peak=peakIndex(nums);
      int firsthalf=orderAgnostic(nums,n,0,peak);
      if(firsthalf!=-1)
      {
       return firsthalf;
      }
      else
      {
       return orderAgnostic(nums,n,peak+1,nums.length-1);
      }
   }
 
    
    public static void main(String[] args)
    {
       int[] nums ={1,3,5,7,4,2,0};
       System.out.print(searchMountain(nums, 1));
    }
}
