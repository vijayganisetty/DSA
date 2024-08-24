package BinearSearch;
public class Infinitearray {
    
    //search an element in infinite sorted array
    //this is no possible way to input an infine array to a method 
    //so, we consider of searching for element with out using length method
    // as we input only finite array , some of the elements can not be found and give an index out of range exception.
    // for finite 

    static int binarySearch(int[] nums,int n,int s,int e)
    { 
         while(s<=e)
         {
         int mid=s+(e-s)/2;  //(e-s) used because there might be chance of int range increasing i.e s+e 
                             // so to avoid that s+(e-s)/2 == (2s+e-s)/2 === (s+e)/2
         if(n==nums[mid])
         {
             return mid;
         }
         else if(n>nums[mid])
         {
             s=mid+1;
         }
         else
         {
             e=mid-1;
         }
         }
         return -1;
      } 
      static int findInInfinite(int[] nums,int n)
      {  
         int s=0;
         int e=1;
         while(n>nums[e])
         {
           int news=e+1;   // new s
           e= e+(e-s+1)*2;   // (e-s+1) used to find the length of previous array;               
           s=news;   
         }
         return binarySearch(nums, n, s, e);
         
      }
      public static void main(String[] args)
      { 
       int[] nums={1,2,3,4,5,6,7,8,9,10};
       System.out.println(findInInfinite(nums,5));
      }
}
