package Basics;
import java.util.Scanner;

public class AssThree2 {
     public static void main(String args[])
     {
        Scanner sc = new Scanner(System.in);
        
        // Factorial
        // System.out.println("enter a number");
        // int x=sc.nextInt();
        // int fct=1;
        // for(int i=1;i<=x;i++)
        // {
        //        fct=fct*i;
        // }
        // System.out.println("Fatorial of "+x+" is "+fct);

        //electricity bill
        // System.out.println("enter the units of curret used ");
        // int x = sc.nextInt();
        // if(x<=90)
        // {
        //     System.out.println("the bill is "+x*4);
        // }
        // else if(x>90 && x<140)
        // {
        //     System.out.println("the bill is "+x*6);
        // }
        // else 
        // {
        //     System.out.println("the bill is "+x*8);
        // }

        //average of n
      //   System.out.println("enter no. of numbers");
      //   int n = sc.nextInt();
      //   int sum =0;
      //   System.out.println("enter numbers :");
      //   for(int i=1;i<=n;i++)
      //   {
      //   int x=sc.nextInt();
      //   sum+=x;
      //   }
      //   System.out.println("Average is "+sum/n);

      //discount of product
      // System.out.println("enter price of product");
      // int x = sc.nextInt();
      // System.out.println("enter discount of product");
      // double y = sc.nextDouble();
      // System.out.println("Discount price is");
      // System.out.println(x*y/100);
      // System.out.println("amount to be paid ");
      // System.out.println(x-x*y/100);

      //dis b/w two points
      // System.out.println("entre two points ");
      // double x = sc.nextDouble();
      // double y = sc.nextDouble();
      // System.out.println("distance b/w two points is "+(x-y));

      //Commission percentage
      // System.out.print("enter total amount :");
      // double x = sc.nextDouble();
      // System.out.print("entre commission : ");
      // double y = sc.nextDouble();
      // System.out.print("Commision percentage :"+(y/x)*100);
        
      //reverse of string
      // System.out.println("entre String ");
      // String s = sc.nextLine();
      // String s2 = "";
      // for(int i=s.length()-1;i>=0;i--)
      // {
      //   s2+=s.charAt(i);
      // }
      // System.out.println("Reverse of "+s+" is "+s2);

      //Vowel and Consonant
      // System.out.println("enter an aplabet");
      // char x = sc.nextLine().trim().charAt(0);
      
      // if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
      // {
      //    System.out.print("vowel");   
      // }
      // else if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u') 
      // {
      //     System.out.print("vowel");  
      // }
      // else
      // {
      //      System.out.print("Consonant");  
      // }


   //Palindrome
   //  System.out.print("enter a number");
   //  int x = sc.nextInt();
   //  int n=x;
   //  int rev=0;
   //  while(n>0)
   //  {
   //    int a = n%10;
   //    rev=rev*10+a;
   //    n=n/10;
   //  }
   //  if(rev==x)
   //  {
   //     System.out.print("palindrome");  

   //  }
   //  else{
   //     System.out.print("not a palindrome");  
   //  }
   //armstrong
   //  System.out.print("enter a number ");
   //  int x = sc.nextInt();
   //  int a=x; 
   //  int n=x; 
   //  int num=0;
   //  int c=0;
   //  while(a>0)
   //  {
   //    a=a/10;
   //    c++;
   //  }
   //  while(n>0)
   //  {
   //    int k = n%10;
   //    num =num+(int)Math.pow(k,c);
   //    n=n/10;
   //  }
   //  if(num==x)
   //  {
   //    System.out.println(x+" is armstrong");
   //  }
   //  else{
   //    System.out.println(x+" is not armstrong");
   //  }
   
     //PERFECT NUMBER
   //   System.out.println("Enter a  number");
   //   int x = sc.nextInt();
   //   int num =0;
   // for(int j=1;j<=x;j++)
   // { 
   //    num=0;
   //   for(int i=1;i<j;i++)
   //   {
   //     if(j%i==0)
   //     num+=i;
   //   }
       
   //   if(j==num)
   //   {
   //    System.out.print(j+" ");
   //   }
   // }

   //leap year
   // System.out.print("Enter year : ");
   // int x = sc.nextInt();
   // if(x%100==0 && x%400==0 || x%100!=0 && x%4==0)
   // {
   //    System.out.println(x+" is leap year");
   // }
   // else

   // {
   //    System.out.println(x+" is not leap year");
   // }

   //even days of august
   // int count=0;
   // int x=31;
   // for(int i=1;i<=x;i++)
   // {
   //    if(i%2==0)
   //    {
   //       count = count+1;
   //    }
      
   // }
   // System.out.println(count);

   //sum positive and negatives
//   int p=0;int n=0;
//    while(true)
//    {
//       System.out.print("enter a number ");
//       int x = sc.nextInt();
      
//       if(x>0)
//       {
//          p+=x;
//       }
//       else if(x<0)
//       {
//         n+=x;
//       }
//       else if (x==0)
//       {  
//          System.out.println("Sum of positive numbers is "+p);
//          System.out.println("Sum of negative  numbers is "+n);
//          System.out.print("exiting....");
//          break;
//       }
//       else{
//          System.out.print("enter a number");
//       }
      
//    }
   }

 
}
