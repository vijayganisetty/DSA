public class SquareRoot {
    

    static int sqrt(int x)
    {
        if(x==0)
        {
            return 0;
        }
        int start =1;
        int end=x;
        int ans=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(x/mid==mid){
                return mid;
            }
            else if(x/mid<mid)
            {
               end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int x=69;
        System.out.println(sqrt(x));
    }
} 
