package BinearSearch;
import java.util.Arrays;

//index of a numeber's first and last occurence in a sorted array
// a=[1,2,3,3,3,4,5]
// we need to perform binar search two time one is for fist occurence and other is for last occurence
// start the binary search if element found  to the left if index is TRUE
//After completly searching the occurences before it gets the fist position 
//For second  search start form middle and searches to the last element that gives the last position.

public class FirstAndLast {
    
    static int fastLast(int[] nums,int n,boolean index)
    {
   
     int s=0;
     int e=nums.length-1;
     int ans=-1;
     while(s<=e)
     {
        
        int mid=s+(e-s)/2;
         if(n<nums[mid]){
             e=mid-1;
         }
         else if(n>nums[mid])
         {
             s=mid+1;
         }
         else
         {   
             ans=mid; // if the presence of target it is passed to ans
                      // initial existed value to changed for every presence of element
             if(index)
             {
                 e=mid-1;
             }
             else
             {
                 s=mid+1;
             }
         }
          
     }
    return ans;
 }
    static int[] fandl(int[] nums,int n)
    { 
     int[] res = {-1,-1};
     res[0]=fastLast(nums,n,true); //this true is taken to search before past of mid
     res[1]=fastLast(nums,n,false) ;//this is to search after part of the mid 

     if(res[0]==res[1])
     {
        res[1]=-1;
     }
     return res;
    }
    public static void main(String[] args)
    {
        int[] nums={1,2,3,3,3,3,6};
        System.out.println(Arrays.toString(fandl(nums,3)));
    }
}
