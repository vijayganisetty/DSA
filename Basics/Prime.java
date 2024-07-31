import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a  number");
   int x = sc.nextInt();
   int count=0;
   
   for(int i=1;i*i<x;i++)
   {  
      
      if(x%i==0)
      {
      count+=1;
      }
   }
   
   if(count==1)
   {
    System.out.println(x+" is prime number");
   }
   else{
    System.out.println(x+" is not a prime number");
   }
   
}
}
/*prime number - 10000019 */