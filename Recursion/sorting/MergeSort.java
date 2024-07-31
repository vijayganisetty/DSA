package sorting;

import java.util.Arrays;

public class MergeSort {

    static int[] mergeSort(int[] nums)
    {
      if(nums.length==1)
      {
        return nums;
      }

      int mid= nums.length/2;

      int[] left = mergeSort(Arrays.copyOfRange(nums,0, mid));
      int[] right= mergeSort(Arrays.copyOfRange(nums,mid, nums.length));

      return merge(left,right);

    }

    static int[] merge(int[] l,int[] r)
    {
        int[] ans= new int[l.length+r.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<l.length && j<r.length)
        {
            if(l[i]<r[j])
            {
                ans[k]=l[i];
                i++;
            }
            else{
                ans[k]=r[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the arrays is not possible
        //copy the remaining elements
        while(i<l.length)
        {
            ans[k]=l[i];
            i++;
            k++;
        }
        
        while(j<r.length)
        {
            ans[k]=r[j];
            j++;
            k++;
        }


        return ans;
    }

    static void mergeSortOriginal(int[] nums,int s,int e)
    {
      if(e-s==1)
      {
        return ;
      }

      int mid= (s+e)/2;

       mergeSortOriginal(nums,s, mid);
       mergeSortOriginal(nums,mid,e);

        mergeOriginal(nums,s,mid,e);

    }

    static void mergeOriginal(int[] arr,int s,int mid,int e)
    {
        int[] ans= new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid && j<e)
        {
            if(arr[i]<arr[j])
            {
             ans[k]=arr[i];
             i++;   
            }
            else{
                ans[k]=arr[j];
                 j++; 
            }
            k++;

        }

        //it may be possible that one of the arrays is not possible
        //copy the remaining elements
      
        while(i<mid)
        {
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(j<e)
        {
            ans[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0;l<ans.length;l++)
        {
            arr[s+l]=ans[l];

        }
    }
    public static void main(String[] args)
    {
           
        int[] arr = {4,8,9,10,2,3};

        // System.out.print(Arrays.toString(mergeSort(arr)));

        mergeSortOriginal(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    
}

