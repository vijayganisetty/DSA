package Basics;
import java.util.Scanner;

public class AssOne  {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
      /* 
        // leap year
        System.out.print("Enter year :");
        int x = sc.nextInt();
        
        if(x%100==0 && x%400==0)
        {
            System.out.println(x+" is leap year");
        }
        else if(x%4==0 && x%100!=0)
        {
          System.out.println(x+" is leap year");  
        }
        else
        {
            System.out.println(x+" is not a leap year");
        }
       
        //add of two nums
        System.out.print(" Enter any two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x+y;
        System.out.println("sum of "+x+" and "+y+" is "+z);

        //multiplication table
        System.out.print(" Enter number: ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
          System.out.println(n+"x"+i+"="+n*i);
        }
        
        //lcm and hcf
        System.out.print("enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int hcf=0;
        for(int i=1;i<=x || i<=y;i++ )
        {
          if(x%i==0 && y%i==0)
          {
           hcf=i;
          }
        }
        System.out.print(hcf);
        
        System.out.print("enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int hcf=0;
        for(int i=1;i<=x && i<=y;i++ )
        {
          if(x%i==0 && y%i==0)
          {
           hcf=i;
          }
        }
        System.out.print(hcf);
         */
        //add nums until x enterd
        System.out.print("enter number : ");
        int sum=0;
          while(true)
          {
            String s = sc.nextLine();
            char x = s.charAt(0);
            if(x=='x')
            {
              break;
            }
            else
            {
              sum+=Integer.parseInt(s);
              
            }
          }
          System.out.print(sum);
        
       
    }


}
