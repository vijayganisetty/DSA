package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DayOne {
    
    //Rigth rotation of array by k times

    static int[] rightrotate(int[] nums,int k)
    {
        Reverse(nums, 0, nums.length-1);
        Reverse(nums,0,k-1);
        Reverse(nums,k,nums.length-1);

        return nums;

    }
     //Reverse of an array
    static int[] Reverse(int[] nums,int i,int j)
    {   
       while(i<=j)
       {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
       }
       return nums;

    }

    //Can both string are same after re-aranging

    static boolean areSameString(String s1,String s2)
    {
        // int c1=countTotal(s1);
        // int c2=countTotal(s2);
        // if(c1==c2)
        // {
        //     return true;
        // }
        // return false;

        String a1 = sortString(s1);
        String a2=sortString(s2);
        
        if(a1.equals(a2))
        {
            return true;
        }
        return false;
        
    }

    static String sortString(String str)
    {
        String s = new String(str);
         
        char[] sortch = s.toCharArray();
        Arrays.sort(sortch);

        return new String(sortch);

    }

    static int countTotal(String str)
    {
        int c=0;
        for(int i=0;i<str.length();i++)
        {
             c+=str.charAt(i);
        }
        return c;
    }

    static int matrix(int[] nums)
    {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd= new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
       return even.get(even.size()-2)+odd.get(odd.size()-2);
    }

    static int[] bsort(int[] nums)
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

    static boolean strongPassword(String str)
    {

        if(str.length()<4)
        {
            return false;
        }
        if(str.charAt(0)>=48 && str.charAt(0) <=57)
        {
            return false;
        }
        int cp=0;
        int num=0;
        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);

            if(c>='A' && c<='Z' )
            {
                cp++;
            }
            if(c>=48 && c<=57)
            {
                num++;
            }
            if(c==' ' || c=='/')
            {
                return false;
            }

        }
        return cp>0 & num>0;
    }

    static int Autobigraphical(String str)
    {
        if(str=="")
        {
           return 0;
        }

        int nums[]={0,0,0,0,0,0,0,0,0,0};
         
        for(int i=0;i<str.length();i++)
        {
            char c= str.charAt(i);
            if(c>=48 && c<=57)
            {
                nums[c-48]++;
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(nums[i]!=str.charAt(i)-48)
            {
                return 0;
            }
        }
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=1)
            {
                c++;
            }
        }

        return c;

    }

    static int distinct(int[] nums)
    {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            int f=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    f++;
                    break;
                }
            } 
            if(f==0)
            {
                c++;
            }
        }
        return c;
    }


    public static void main(String[] args)
    {

        int[] nums={3,4,1,7,9};
        // System.out.print(Arrays.toString(Reverse(nums,0,nums.length-1)));
        // System.out.print(Arrays.toString(rightrotate(nums, 4)));
        // System.out.print(areSameString("vijay","jayvi"));
    //    System.out.println(matrix(nums));
        // System.out.println(Arrays.toString(bsort(nums)));
    // System.out.println(strongPassword("aZ23_1bd"));
    // System.out.println(Autobigraphical("72110"));
    // System.out.print(distinct(nums));
    }
}
