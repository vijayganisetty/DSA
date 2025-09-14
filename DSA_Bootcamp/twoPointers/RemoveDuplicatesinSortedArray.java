package DSA_Bootcamp.twoPointers;

public class RemoveDuplicatesinSortedArray {

    public static void main(String[] args) {

        int[] nums = {0,0,1,2,2,3};

        int j =1;

        for(int i=1;i<nums.length;i++){

            if(nums[i] != nums[j-1]){
                nums[j] = nums[i];
                j++;
            }
        }

        // till j we have unique values
        for(int i=0;i<j;i++){
            System.out.println(nums[i]);
        }
    }
}
