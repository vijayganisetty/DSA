package SortingOfArray;

public class RadixSort {

    static void rSort(int[] nums){

        int largedigit=0;
        for(int i=0;i<nums.length;i++){
            int x = (int) Math.log10(nums[i])+1;
            if(x>largedigit){
                largedigit=x;
            }
        }
        System.out.println(largedigit);

        for(int exp =1;exp<=largedigit; exp*=10){
            countSort(nums,exp);
        }
    }

    private static void countSort(int[] nums, int exp) {
        int n=nums.length;
        int[] output = new int[n];
        int[] count = new int[exp];

        //Dropped


    }

    public static void main(String[] args) {

        int[]  arr = {29,83,471,36,91,8};

    }
}
