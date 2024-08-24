package Recursion.searching;

public class RotatedBiSeaRec {
    
    //Rotated Binary Search using recursion
    static int Search(int[] arr,int n,int s, int e)
    {

        if(s>e)
        {
            return -1;
        }

        int m=s+(e-s)/2;
        if(arr[m]==n)
        {
            return m;
        }
        if(arr[s]<=arr[m])
        {
            if(n>=arr[s] && n<=arr[m])
            {
              return Search(arr,n,s,m-1);
            }
            else{
                 return Search(arr,n,m+1,e);
            }
        }

        if(n>=arr[m] && n<=arr[e])
        {
            return Search(arr,n,m+1,e);
        }
        else{
            return Search(arr,n,s,m-1);
        }
   

    }

    public static void main(String[] args)
    {

       int[] num={5,6,7,8,9,1,2,3};

       System.out.print(Search(num,0,0,num.length-1));

    }
}
