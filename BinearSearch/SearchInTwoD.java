package BinearSearch;
import java.util.Arrays;

public class SearchInTwoD {
    

    static int[] binarySearch(int[][] matrix,int row,int cStart , int cEnd,
    int target)
    {
        while(cStart<=cEnd)
        {
            int mid=cStart+(cEnd-cStart)/2;
            if(target==matrix[row][mid])
            {
             return new int[]{row,mid};
            }
            else if(target>matrix[row][mid])
            {
                cStart=mid+1;
            }
            else
            {
                cEnd=mid-1;
            }
            
        }
        return new  int[]{-1,-1};

    }
    static int[] search(int[][] matrix,int target)
    {
        int r=matrix.length;
        int c=matrix[0].length-1;
        if(r==0)
        {
            return binarySearch(matrix,0,0,c,target);
        }
        int rStart=0;
        int rEnd= r-1;
        int cmid=c/2;
            while(rStart<rEnd-1)
            {   
                int mid=rStart+(rEnd-rStart)/2;
               if(target==matrix[mid][cmid])
               {
                return new int[]{mid,cmid};
               }
               if(target>matrix[mid][cmid])
               {
               rStart=mid;
               }
               else{
                rEnd=mid;
               }
            }
           
            if(matrix[rStart][cmid]==target)
            {

                return new int[]{rStart,cmid};
            }
            if(matrix[rStart+1][cmid]==target)
            {
             return new int[]{rStart+1,cmid};   
            }
            if(target<=matrix[rStart][cmid-1]){
             return binarySearch(matrix,rStart,0,cmid-1,target);
            }
            if(target>=matrix[rStart][cmid+1] && target<=matrix[rStart][c-1]){
              return binarySearch(matrix,rStart,cmid+1,c-1,target);   
            }
            if(target<=matrix[rStart+1][cmid-1]){
               return binarySearch(matrix,rStart+1,0,cmid-1,target);  
            }
             else{
                 return binarySearch(matrix,rStart+1,cmid+1,c-1,target);
            }
    }

    public static void main(String[] args)
    {
        int[][] matrix={{1,2,3,},{4,5,6},{7,8,9}};
         int target=4;
         System.out.println(Arrays.toString(search(matrix, target)));

    }
}
