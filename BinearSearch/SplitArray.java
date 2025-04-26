package BinearSearch;
public class SplitArray {

    static int findMin(int[] nums,int m)
    {
         int s=0;
        int e=0;
        for(int i=0;i<nums.length;i++)
        {
            s=Math.max(s,nums[i]);
            e+=nums[i];
        }
        while(s<e)
        {
            int mid=s+(e-s)/2;
            int sum=0;
            int pieces=1;
            for(int num:nums)
            {
                if(sum+num>mid)
                {
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
                if(pieces>m) 
                {
                    s=mid+1;
                }
                else {
                    e=mid;
                }
            
        }
        return e;
    }
    
    public static void main(String[] args)
    {
        int[] nums={7,2,5,10,8};
        int m=1;

        System.out.println(findMin(nums, m));

    }
}
