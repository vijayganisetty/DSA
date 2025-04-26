package Strings;

import java.util.Scanner;

public class Palindrome {

    static boolean isPali(String str)
    {
        if(str==null || str.isEmpty())
        {
            return true;
        }
        for(int i=0;i<str.length()/2;i++)
        {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
          if(start!=end)
                {
                    return false;
                }
        }
          
    return true; 
    }
       
        
    
    public static void main(String[] args)
    {
    //  String str ="abcba";
    //  System.out.print(isPali(str));

      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

    

    }


}
