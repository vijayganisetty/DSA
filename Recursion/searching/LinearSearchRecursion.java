package Recursion.searching;
import java.util.ArrayList;

public class LinearSearchRecursion {
    
    static boolean isSorted(int[] nums,int s)
    {
        if(s==nums.length-1)
        {
            return true;
        }
        
        return nums[s]<nums[s+1] && isSorted(nums, s+1);
 
        
    }

    static boolean linearSearch(int[] nums,int i,int n)
    {
        if(i==nums.length)
        {
            return false;
        }

        return nums[i]==n || linearSearch(nums, i+1, n);

    }

    
    static int findIndex(int[] num,int i,int n)
    {
        if(i==num.length)
        {
            return -1;
        }
        if(num[i]==n)
        {
           return i;
        }
        else{
            return findIndex(num, i+1, n);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();

    static void findDoubleIndex(int[] num,int i,int n)
    {
        if(i==num.length)
        {
            return;
        }
        if(num[i]==n)
        {
            list.add(i);
        }
        findDoubleIndex(num, i+1, n);
    }

    static ArrayList findnums(int[] num,int i,int n, ArrayList<Integer> list)
    {
        if(i==num.length)
        {
            return list;
        }
        if(num[i]==n)
        {
            list.add(i);
        }
       return findnums(num,i+1,n,list);
    }

    static ArrayList<Integer> findAllIndex(int[] num,int i,int n)
    {
        ArrayList<Integer> list = new ArrayList<>();

        if(i==num.length)
        {
            return list;
        }
        if(num[i]==n)
        {
            list.add(i);
        }
        
        ArrayList<Integer> ansFromBelow = findAllIndex(num, i+1, n);
        list.addAll(ansFromBelow);
        return list;

    }
    public static void main(String[] args)
    {
        int[] arr ={0,2,0,4,0};
        ArrayList<Integer> l = new ArrayList<>();

        // System.out.println(isSorted(arr, 0));

        // System.out.println(linearSearch(arr, 0, 6 ));

        // System.out.println(findIndex(arr, 0, 0)); 

        // findDoubleIndex(arr, 0, 0);
        // System.out.println(list);
        // System.out.println(findnums(arr,0,5,l));
        System.out.println(findAllIndex(arr,0,0));
    }
}
