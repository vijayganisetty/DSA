package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Recode {



     static int linearSearch(int[] nums,int find){

        for(int i=0;i<nums.length;i++){
            if(nums[i]==find){
             return i;
            }
        }
        return -1;
       }  

       static int binarySearch(int[] nums,int find){


        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid= s +(e-s)/2;   
        if(nums[mid]==find){
            return mid;
        }
        else if(nums[mid]>find){
            e=mid-1;
        }
        else{
            s=mid+1;
        }
        }
        return nums[s];
       }

    static int[] firstlast(int[] nums , int n){
        int[] res={-1,-1};
        res[0]=fandl(nums,n,true);
        res[1]=fandl(nums,n,false);
        return res;
    } 

    private static int fandl(int[] nums, int n, boolean index) {
        
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid = s+(e-s)/2;

            if(nums[mid]>n){
                e=mid-1;
            }
            else if(nums[mid]<n){
                s=mid+1;
            }
            else{
                ans=mid;
                if(index){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            } 
        }
        return ans;
    } 

    static int peakOfArray(int[] nums)
    {
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;

            if(nums[mid]>nums[mid+1]){
                e= mid;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }

    static int[] bubbleSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        return nums;
    }

    static int[] selectionSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int last=nums.length-i-1;
            int max= getMax(nums,0,last);
             swap(nums,max,last);
        }
        return nums;
    }
     private static void swap(int[] nums, int max, int last) {
        int temp=nums[max];
        nums[max]=nums[last];
        nums[last]=temp;
       
    }

    static int getMax(int[] nums, int start, int last) {
        int big=0;
        int i=0;
        for(i=0;i<=last;i++){
               if(nums[i]>nums[big]){
                  big=i;
               }
        }
        return big ;
    }

    static int fiboFormula(int n){

        int x = (int) (((Math.pow(((1+Math.sqrt(5))/2),n))-(Math.pow(((1-Math.sqrt(5))/2),n)))/Math.sqrt(5));
        return x;
    }

    static int OccursOnce(int[] nums){
        int unq=0;
        for(int x :nums){
            unq ^= x;
        }
        return unq;
    }

    static double sqrt(int n,int p){

        double root = 0.0;
        double inc=0.01;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                 root+=inc;
                 }
            root-=inc;
            inc/=10;
             }
        return root;
    }

    static int[] rev(int[] nums,int s,int e){

        int i=s;
        int j=e;
        while(i<j){
            int temp=nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
            i++;
            j--;
        }
        return nums;
    }

    static int[] rightRotate(int[] nums,int k){

        rev(nums, 0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
        return nums;
    }
    static int[] leftRotate(int[] nums,int k){

        rev(nums, 0,nums.length-1);
        rev(nums,nums.length-k,nums.length-1);
        rev(nums,0,nums.length-k-1);
        return nums;
    }

    static void duplicate(int[] nums){
        int rd=0;
        for(int i=1;i<nums.length;i++){
            if(nums[rd]!=nums[i]){
                rd++;
                nums[rd]=nums[i];
            }
        }
        for(int i=0;i<=rd;i++){
            System.out.print(nums[i]+" ");
        }
    }

    //TCS
    static void subArrayMax(){
        int[] num={1,2,3,4,5,6,7,8,9};
        int k=3;
        for(int i=0;i<=num.length;i++){
            if(i<=num.length-k){
                int large=0;
                for(int j=i;j<k+i;j++){
                    if(num[j]>large){
                            large=num[j];
                    }
                }
                System.out.println(large);
            }
        }
    }

    static void arrayHalfCount(int[] nums){
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>=nums.length/2){
                System.out.println(nums[i]);
            }
        }
    

    }

    static int  minimumUnfairness(int[] nums , int k){

        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
            int max=nums[0];
            int min=nums[0];
        for(int j=0;j<k;j++){
            if(nums[j]>max){
                max=nums[j];
            }
            if(nums[j]<min){
                min=nums[j];
            }
        }
        return max-min;    
    }

    static ArrayList<Integer> commonDigit(int a,int b,int c){

        ArrayList<Integer> ans= new ArrayList<>();
        int[] ac=new int[10];
        int[] bc=new int[10];
        int[] cc=new int[10];

        while(a>0){
            ac[a%10]++;
            a=a/10;
        }
        while(b>0){
            bc[b%10]++;
            b=b/10;
        }
        while(c>0){
            cc[c%10]++;
            c=c/10;
        }
         for(int i=0;i<10;i++){
            if(ac[i]>=1 && bc[i]>=1 && cc[i]>=1){
                 ans.add(i);
            }
         }
         return ans;
    }

    static int ballAndBox(int[] nums){
        int balls=0;
        for(int i=0;i<nums.length;i++){
            int x = (int) Math.pow(i+1, 2);
            if(nums[i]<x ){
                balls += x-nums[i];
            }
        }
        if(balls>0){
                  return balls;
        }
            return 0;
    }

    static int addEveryNth(int[] nums , int n){
        int sum=0;

        for(int i=n-1;i<nums.length;i+=n){

            sum+=nums[i];


        }
        return sum;
    }

    static void butterfly(int n){
        
        for(int i=1;i<=n*2;i++){
            if(i<=n){
            for(int j=1;j<=i;j++){
                System.out.print("*"+"");
            }
            for(int j=n*2;j>i*2;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+"");
            }
          
            }
            else{
                for(int k=n*2-i;k>=1;k--){
                    System.out.print("*"+"");
                }
                // for(int k=i-n;k<=k*2;k++){
                //     System.out.print(" ");
                // }
                for(int k=n*2-i;k>=1;k--){
                    System.out.print("*"+"");
                }
            }
            System.out.println();
        }
    }
    static void floyd(int n){
       
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }

    static int[] evenOdd(int[] nums){

        int[] res = new int[nums.length];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }

        for(int i=0;i<even.size();i++){

            res[i]=even.get(i);
        }

        for(int j=0;j<odd.size();j++){
            res[j+even.size()]=odd.get(j);
        }
        return res;
        

    }
    public static void main(String[] args){
        // System.out.println(Arrays.toString(firstlast(nums, find)));
        // System.out.println(binarySearch(nums,find));
        // System.out.println(peakOfArray(nums));
        // System.out.println(Arrays.toString(bubbleSort(nums)));
        // System.out.println(Arrays.toString(selectionSort(nums)));
        // System.out.println(fiboFormula(10));
        // System.out.println(OccursOnce(nums));
        // System.out.printf("%.3f",sqrt(26, 3));
        // System.out.println(Arrays.toString(rightRotate(nums,4)));
        // System.out.println(Arrays.toString(leftRotate(num,4)));
        // duplicate(nums);
        // subArrayMax();
        // arrayHalfCount(nums);
        // int[] nums={10,100,300,200,1000,20,30};
        //   System.out.println(minimumUnfairness(nums, 3));

        // System.out.println(commonDigit(1209,1390,1409));
        // System.out.println(ballAndBox(nums));
        // int[] nums = { 1,2,3};
        // System.out.println(addEveryNth(nums, 2));

        // Scanner sc = new Scanner(System.in);

        // int x = sc.nextInt();
        // int y=sc.nextInt();
        // System.out.println(x+"+"+y+"="+(x+y));


        //   butterfly(6);

        // floyd(4);
      
        int[] nums={1,2,3,4,5,6};
        System.out.println(Arrays.toString(evenOdd(nums)));
       
    }
    
}
   