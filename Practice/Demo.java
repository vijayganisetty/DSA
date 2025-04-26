package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Demo {
    
    static boolean prime(int n)
    {
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

  

    static void printhello()
    {
        if(System.out.printf("hello world")==null)
        {
            return ;
        }
    }

    // static int[] leftRotate(int[] nums,int n)
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         int temp=nums[0];
    //         for(int j=0;j<nums.length-1;j++)
    //         {
    //             nums[j]=nums[j+1];
    //         }
    //         nums[nums.length-1]=temp;
    //     }
    //    return nums;
    // }

    static int[] reverseArray(int[] nums,int i,int j)
    {
        while(i<=j)
        {
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]= temp;
            i++;
            j--;
        }
        return nums;
    }

  
        static int[] rightRotate(int[] nums, int k) {
            k%=nums.length;
           reverseArray(nums,0,nums.length-1);
           reverseArray(nums,0,k-1);
           reverseArray(nums,k,nums.length-1);
           return nums;
        }
        static int[] leftRotate(int[] nums, int k) {
            k%=nums.length;
           reverseArray(nums,0,nums.length-1);
           reverseArray(nums,0,nums.length-1-k);
           reverseArray(nums,nums.length-k,nums.length-1);
           return nums;
        }

    static int[] sort(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length-i;j++)
            {
                if(nums[j]<nums[j-1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;

                }
            }
        }
        return nums;
    }

    static int minofArray(int[] nums)
    {
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<min)
            {
                min=nums[i];
            }
        }
        return min;
    }
     static int maxofArray(int[] nums)
    {
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        return max;
    }

    static int secondLargest(int[] nums)
    {
        sort(nums);
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]!=nums[nums.length-1]){
                return nums[i];
            }
        }  
        return 0;
    }

    static void duplicates(int[] nums)
    {
        int rd=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[rd]!=nums[i])
            {
                rd++;
                nums[rd]=nums[i];
            }
        }
        for(int i=0;i<=rd;i++)
        {
            System.out.print(nums[i]);
        }

    }

    static void duplicatesUnsorted(int[] nums)
    {
        HashSet<Integer> ans= new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            ans.add(nums[i]);
        }
        for(int i:ans) 
        {
        System.out.print(i);
        }
     }

    static boolean isValid(String s) {
        Stack<Character> ans=new Stack<>();
 
         for(int i=0;i<s.length();i++)
         {
            char ch=s.charAt(i);
 
            if(ch=='(')
            {
                   ans.push(')');
            }
            else if(ch=='{')
            {
                   ans.push('}');
            }
           else if(ch=='[')
            {
                   ans.push(']');
            }
            else{
                if(ans.isEmpty() || ans.pop()!=s.charAt(i))
                {
                    return false;
                }
            }
            
          }
          return ans.isEmpty(); 
     }

      ///////////////////////////////////////
     static int[] sortEvenOdd(int[] nums)
     {
         ArrayList<Integer> even = new ArrayList<>();
         ArrayList<Integer> odd = new ArrayList<>();
         int[] ans=new int[nums.length];
          
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]%2==0)
           {
             even.add(nums[i]);
           }
           else{
              odd.add(nums[i]);
           }
        }
        System.out.print(even);
        System.out.print(odd);

        for(int i=0;i<even.size();i++)
        {
            ans[i]=even.get(i);
        }
        for(int j=0;j<odd.size();j++)
        {
             ans[j+even.size()]=odd.get(j); 
        }
        return ans;
     }

     static int hcf(int a,int b)
    {
    if(a==0)
    {
        return b;
    }
    return hcf(b%a,a);
    }

    static void pattern(int n)
    {
        int k=1;
        for(int i=1;i<=n;i++)
        {   
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                 k++;
            }
           
            System.out.println(" ");
        }
    }

    static String conversion(String s)
    {
        int u=0;
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if((int)(ch)>=97 && (int)(ch) <=122)
            {
               l++;
            }
            else if((int)(ch)>=65 && (int)(ch) <=90)
            {
                u++;
            }
        }

        if(l>=u)
        {
            return s.toLowerCase();
        }
         return s.toUpperCase();
    }

      static int Countprimes(int n)
    {
        int count=0;
         int c=0;
        for(int i=2;i<=n;i++)
        {
            c=0;
            for(int j=1;j*j<=i;j++)
            {
            if(i%j==0)
            {
              c++;
            }
            }
    
            if(c==1)
            {
             count++;
            }

    }
    return count;
    }

    static int  cycleSort(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }

        return -1;
    }

    static int secondSmallest(int[] nums)
    {
        bsort(nums);

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[0])
            {
                 return nums[i];
            }
        }
        return -1;
    }

    static int[] bsort(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
           for(int j=1;j<nums.length-i;j++)
           {
                  if(nums[j]>nums[j-1])
                  {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                  }
           }
        }
        return nums;
    }

    static boolean rohan(int n)
    {
        if(n%4==0 || n%7==0)
        {
            return true;
        }
         return false;
    }

    static boolean primeNUM(int n)
    {
        if(n<=1)
            {
                return false;
            }
        for(int i=2;i*i<=n;i++)
        {
            
            if(n%i==0)
            {
               return false; 
            }
        }
        return true;
    }

    static boolean leapYear(int n)
    {
        if(n%4==0 && n%100!=0)
        {
            return true;
        }
        else if(n%100==0 && n%400==0)
        {
            return true;
        }
        return false;
    }
    ///////////////////////////////////////
    static int countPerfectSquares(int n)
    {
        int count=0;
        while(n>=1)
        {
            int x=(int)Math.sqrt(n);
            if(x*x==n)
            {
                count++;
            }
            n--;
        }
        return count;
     }
    static int PerfectSquares(int n)
     {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j*j<=i;j++)
            {
                if(j*j==i)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
     }

    static int metro(int rides,int sp,int nrcost,int spcost )
     {
        int cost = spcost*rides;
        if(cost%2==0)
        {
            return cost/sp;
        }
         return (cost+1)/sp;
     }

     static int minSquares(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
 
        for(int i=2;i<=n;i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++)
            {
                int rem=i-j*j;
                if(dp[rem]<min)
                {
                    min=dp[rem];
                }
            }
            dp[i]=min+1;
        }
        System.out.print(Arrays.toString(dp));
        return dp[n];
     }

     static int countPrime(int n)
     {
        boolean[] ans=new boolean[n+1];
        int count=0;
        for(int i=2;i*i<n;i++)
        {
           if(ans[i]==false)
           {
            for(int j=i*2;j<=n;j+=i)
            {
                ans[j]=true;
            }
           } 
        }
        for(int i=2;i<n;i++)
        {
            if(ans[i]==false)
            {
                count++;
            }
        }
        return count;

     }
     static String convertToPalindrome(String str)
     {
           if(str.equals(new StringBuilder(str).reverse().toString()))
           {
            return str;
           }
           else{
            for(int i=0;i<str.length();i++)
            {

            String s1 = str+ new StringBuilder(str.substring(0+i)).reverse().toString();
            if(s1.equals(new StringBuilder(s1).reverse().toString()));
            {
                return s1;
            }
            }
        }
        return "null";
     }

    static boolean isPalindrome(String str)
     {
        int i=0;
        int j=str.length()-1;
        while(i<=j/2)
        {
            if(str.charAt(i) !=str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
     }

     static int[] rRotate(int[] nums,int k)
     {
        reverseArray(nums,0,nums.length-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums, k, nums.length-1);
        return nums;
     }  

     static boolean reArrange(String s1,String s2)
     {
        int s1Count=add(s1);
        int s2Count=add(s2);
        if(s1Count==s2Count)
        {
            return true;
        }
        return false;


     }
     static int add(String str)
     {
        int ad=0;
        for(int i=0;i<str.length();i++)
        {
            ad+=str.charAt(i);
        }
        return ad;
     }
    public static void main(String args[])
    {   
        // System.out.print( Countprimes(10));
        // printhello();
        int[] nums={1,2,3,4,5};
        // int[] arr={11,22,33,44,55,66};
        // System.out.print(Arrays.toString(rightRotate(nums,2)));
        // System.out.println();
        // System.out.print(Arrays.toString(leftRotate(arr,2)));
        // System.out.print(Arrays.toString(sort(nums)));
        // System.out.print(minofArray(nums));
        // System.out.print(maxofArray(nums));
        // System.out.print(secondLargest(nums));
        // duplicates(nums);
        // duplicatesUnsorted(nums);
        // 1.  System.out.print(Arrays.toString(sortEvenOdd(nums)));
        // pattern(4);
        // System.out.print(conversion("VijAY"));
        // System.out.print(cycleSort(nums));
        // System.out.print(secondSmallest(nums));
        // System.out.println(rohan(47));
        // System.out.println(primeNUM(10));
        // System.out.println(leapYear(2020));
        // System.out.println(hcf(10,15));
        // System.out.println(4%3);
        // System.out.println(countPerfectSquares(12));
        // System.out.println("-----");
        // System.out.print(PerfectSquares(12));
        // System.out.println(metro(5,2,2,3));
        // System.out.println(minSquares(10));
        // System.out.println(countPrime(17));
        // System.out.println(convertToPalindrome("abba"));/
        // System.out.print(Arrays.toString(rRotate(nums, 3)));
        // System.out.print(reArrange("vijay","jayvi"));
         Long b =8187801815L;
         Long r=0L;
        //  int x=(int) (Math.log10(b)+1);
        int c=0;
        while(b>0)
        {
            c++;
            Long x=b%10;
            r=r*10+x;
            b=b/10;
        }

         System.out.println(r);


 
    }

}
