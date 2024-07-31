public class CelingAndFlour {

    /* celing number - smallest in the array that are equal to or grater then the target array 
      use binary search and if target found return if , if there is no target the while is termenated and return s 
      [ -------s m e------] after termination e m s. so mid is not target .the next one s is the smallest amoung largest.  
     flour number - largest in the array thatare equal to or less then the target array.
     after termination [--- e m s---] . return e.
     */
    
    static int celing(int[] nums,int n)
    {
      int s=0;
      int e=nums.length-1;
      if(n>nums[e])
      {
          return -1;
      }
      while(s<=e)
      {
          int mid=s+(e-s)/2;
          if(n==nums[mid])
          {
              return nums[mid];
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
      return nums[s];
    }

     static int flour(int[] nums,int n)
    {
      int s=0;
      int e=nums.length-1;
      if(n>nums[e])
      {
          return -1;
      }
      while(s<=e)
      {
          int mid=s+(e-s)/2;
          if(n==nums[mid])
          {
              return nums[mid];
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
      return e;
    }

     static char charceling(char[] chars,char c)
     {
      int s=0;
      int e=chars.length-1;
      if(c>chars[e])
      {
      return chars[0];
      }
      while(s<=e)
      {
          int mid=s+(e-s)/2;
          if(c>chars[mid])
          {
           s=mid+1;
          }
          else
          {
            e=mid-1;  
          }
      }
      return chars[s%chars.length];
  
     }
  
    public static void main(String[] args)
    {
        int[] nums = {1,2,3,5,6,7,8};
        int[] nums2 = {2,6,7,8,9,10};
        char[] ch ={'a','c','e','g','j'};
        System.out.println(celing(nums,4));
        System.out.println(flour(nums,4));
        System.out.println(charceling(ch,'f'));
    }
}
