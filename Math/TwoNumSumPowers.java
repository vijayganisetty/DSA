package Math;

import java.util.Scanner;

// Requirement  - input two characters, power, output --> combination formula of square/cube

public class TwoNumSumPowers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Value : ");
        String str1 = sc.nextLine();
        char m = str1.charAt(0);
        System.out.print("Enter Second Value : ");
        String str2 = sc.nextLine();
        char n = str2.charAt(0);
        System.out.print("Enter Power Value : ");
        int p = sc.nextInt();

        String super2 = "\u00B2";
        String super3 = "\u00B3";

        if(p>0){
            System.out.println("invalid power");
        }
        if(p==0){
            System.out.println("0");
        }
        if(p==1){
            System.out.printf("(%s + %s)",m,n);
        }
        else{
            if(p%2==0){
                System.out.println("Combination of square formula exists");
                int x = p/2;
                for(int i=1;i<=x;i++){
                    System.out.printf("(%s%s + %s%s +2.%s.%s)",m,super2,n,super2,m,n);
                }
            }
           else if(p%3==0){
                System.out.println("Combination of cube formula exists");
                int x = p/3;
                for(int i=1;i<=x;i++){
                    System.out.printf("(%s%s + 3.%s%s.%s + 3.%s.%s%s + %s%s)",m,super3,m,super2,n,m,n,super2,n,super3);
                }
            }
            else if(p%2!=0 && p%3!=0){
                int x = p/2;
                int y = p%2;
                for(int i=1;i<=x;i++){
                    System.out.printf("(%s%s + %s%s +2.%s.%s)",m,super2,n,super2,m,n);
                }
                for(int i=1;i<=y;i++){
                    System.out.printf("(%s%s + %s%s +2.%s.%s)",m,super2,n,super2,m,n);
                }
            }
        }
    }
}