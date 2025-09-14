package DSA_Bootcamp.arrayBasics;

import java.util.Arrays;

public class ReverseArray {

    static void newArray(int[] arr){
        int[] rev = new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            rev[arr.length-i-1] = arr[i];
        }
        System.out.println(Arrays.toString(rev));
    }

    static void inPlace(int[] arr){

        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    static void twoPointer(int[] arr){

        int s = 0;
        int e = arr.length-1;

        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        int[] arr = {6,7,8,9,10};

        newArray(nums);
        inPlace(nums);
        twoPointer(arr);

    }
}
