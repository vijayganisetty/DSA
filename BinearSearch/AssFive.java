import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssFive {

    static int[] Permutation(int[] a1)
    {
        int[] a2 = new int[a1.length];
        for(int i=0;i<a1.length;i++)
        {
            a2[i]=a1[a1[i]];
        }
        return a2;
    }

    static int[] concatination(int[] nums)
    {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
   static int[] runningSum(int[] nums)
   {
    int[] ans = new int[nums.length];
     for(int i=0;i<nums.length;i++)
     {
        for(int j=0;j<=i;j++)
        {
            ans[i]+=nums[j];
        }
     }
     return ans;

   }
    static int MaxWealth(int[][] nums)
    {
        int max=0;
        for(int i=0;i<nums.length;i++)
    {
        int sum=0;
        for(int j=0;j<nums[i].length;j++)
        {
            sum+=nums[i][j];
        }
        if(sum>max)
       {
        max=sum;
       }
    }
    return max;
    }

    static int[] ShuffleArray(int[] nums,int n)
    {

        int[] ans=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
        }
        return ans;
    }
    static List<Boolean> candies(int[] candies,int extraCandies)
    {
     List<Boolean> ans = new ArrayList<>();
          
        int max=0;
        for(int j=0;j<candies.length;j++)
        {
            if(candies[j]>max)
             max=candies[j];

        }
        for(int k=0;k<candies.length;k++)
        {
            if(candies[k]+extraCandies>max)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }
        return ans;  
    }
   static int goodPair(int[] nums)
   {
    int count=0;
    for(int i=0;i<nums.length;i++)
    {
        for(int j=0;j<nums.length;j++)
        {
            if(i<j && nums[i]==nums[j])
            {
                count++;
            }
        }
    }
    return count;
   }

   static int[] smallNums(int[] nums)
   {
    int[] ans = new int[nums.length];
    for(int i =0;i<nums.length;i++)
    {   
        int count=0;
        for(int j=0;j<nums.length;j++)
        {
            if(i<j && nums[i]>nums[j])
            {
                count++;
            }
        }
        ans[i]=count;
    }
    return ans;
   }

   // nums=[1,2,3,4,5] index=[2,0,3,1,4]
   static int[] targetArray(int[] nums,int[] index)
   {
    int[] ans = new int[nums.length];
    for(int i=0;i<nums.length;i++)
    {
        if(i<index[i])
        {
            ans[index[i]]=nums[i];
        }
        else{
            for(int j=ans.length-1;j>index[i];j--)
            {
                ans[j]=ans[j-1];
            }
            ans[index[i]]=nums[i];
        }
    }
    return ans;
   }
   static boolean checkIfPangram(String sentence) {
        
    int[] ans = new int[27];
    for(int i=0;i<sentence.length();i++)
    {
        char ch = sentence.charAt(i);
        int idx = ch-'a';
        ans[idx]++;
       
    }
    for(int i=0;i<26;i++)
    {
        if(ans[i]==0)
        {
            return false;
        }
        
    }
    return true;
    
  }
  static int highAlt(int[] nums)
  {
    int num=0;
    int maxalt=0;
    for(int i=0;i<nums.length;i++)
    {
        num+=nums[i];
        maxalt=Math.max(num,maxalt);
    }
    return maxalt;
  }

  static int[] reverseArray(int[] nums)
  {
    int i=0;
    int j=nums.length-1;
    while(i<j)
    {
     int temp=nums[i];
     nums[i]=nums[j];
     nums[j]=temp;
     i++;
    j--;
    }
    
    return nums;
  }
   
  static int[][] flipAndInvertImage(int[][] image) {
    int x=0;
    int y=image[0].length-1;
    for(int i=0;i<image.length;i++)
    {
        for(int j=0;j<image[i].length;j++)
        {   
            while(x<y)
            {
             int temp=image[i][x];
             image[i][x]=image[i][y];
             image[i][y] = temp;
            x++;
            y--;
            }
        }
    }
      for(int i=0;i<image.length;i++)
    {
        for(int j=0;j<image[i].length;j++)
        {
            if(image[i][j]==1)
            {
               image[i][j]=0;
            }
            else
            {
                image[i][j]=1;
            }
        }
    }
    return image;
}

static int leaders(int[] arr)
{
  int sum=0;
  for(int i=0;i<arr.length;i++)
  {   
      int count =0;
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]>arr[j])
        {
          count=arr[i];
        }
        else if(arr[i]<arr[j])
        {
          count=0;
          break;
        }
        else{
          count=0;
        }
        
      }
      sum+=count;

  }
  return sum+arr[arr.length-1];
}

static int minNumbers(int[] a,int x,int y)
{
  int count=0;
  for(int i=0;i<a.length;i++)
  {
      if(a[i]>x && a[i]<y)
      {
          count++;
      }
  }
  if(count>0)
  {
      return count;
  }
  else
  {
      return -1;
  }
}


    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
 
    }
}