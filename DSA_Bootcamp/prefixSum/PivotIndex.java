package DSA_Bootcamp.prefixSum;

public class PivotIndex {

    //Index where left side sum is equal to right sum

    static int pivotSum(int[] nums){

        int total =0;

        for(int n : nums){
            total += n;
        }

        int leftSum =0;

        for(int i=0;i<nums.length;i++){
            int rightSum = total - leftSum - nums[i];

            if(leftSum == rightSum){
                return i;
            }
            leftSum+= nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        System.out.println(pivotSum(nums));

    }
}
