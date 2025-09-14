package Practice;

import java.util.Scanner;

public class GymBro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter days");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter weights of each day");

        int oddDays = 0;
        int evenDays = 0;

        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
            if ((i + 1) % 2 == 0) {
                evenDays += arr[i];
            } else {
                oddDays += arr[i];
            }
        }

        if(oddDays>evenDays){
            System.out.println(STR."\{oddDays} ---> get more effective on odd days");
        }
        else{
            System.out.println(STR."\{evenDays} ---> gets more effective on even days");
        }
    }
}
