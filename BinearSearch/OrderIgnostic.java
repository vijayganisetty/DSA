public class OrderIgnostic {
    static int orderAgnostic(int[] nums,int n,boolean index)
    {
         int s=0;
        int e=nums.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
             if(n==nums[mid])
             {
                return mid;
             }
        if(index){   
            if(n>nums[mid])
            {
            s=mid+1;  
            }
            else
            {
                e=mid-1;
            }
        }
        else{
            if(n<nums[mid])
            {
             s=mid+1;   
            }
            else{
               e=mid-1;
            }
        }
       }
       return -1;
    }
    static int findorder(int[] nums,int n)
    {
        if(nums[0]<nums[nums.length-1])
    {
      return  orderAgnostic(nums, n,true);
    }
    else{
     return orderAgnostic(nums, n,false);
    }
    }
    public static void main(String[] args)
    {
      int[] nums={1,2,3,4,5};
      System.out.println(findorder(nums, 5));
    }
}
