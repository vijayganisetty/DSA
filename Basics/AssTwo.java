import java.util.Scanner;

public class AssTwo {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //even or add
        // System.out.println("enter a number");   
        // int x = sc.nextInt();
        // if(x%2==0)
        // {
        //     System.out.println(x+" is even number");   
        // }
        // else{
        //      System.out.println(x+" is odd number");   
        // }

        //Greetings with name
        // System.out.println("enter a name ");
        // String name = sc.nextLine();
        // System.out.println("Hello "+name+", Good morning");

        // Simple interest
        // System.out.print("Enter principle ");
        // int p = sc.nextInt();
        // System.out.print("Enter time in years ");
        // int t = sc.nextInt();
        // System.out.print("Enter rate ");
        // int r = sc.nextInt();
        // double si = (p*t*r)/100;
        // System.out.print("Simple interest is"+si);

        //arthmetic operations

        while(true){
       System.out.print("enter operation to be done : ");
        char op=sc.next().trim().charAt(0);
       
        if(op=='+' || op=='-' || op=='*' || op=='/')
        {  
             System.out.print("enter two numbers ");
             int a = sc.nextInt();
             int b = sc.nextInt();
            if(op=='+')
             System.out.println(a+b);
            else if(op=='-' )
            {
             System.out.println(a-b);
            }
            else if (op=='*')
            System.out.println(a*b);
            else{
                if(a>b)
                System.out.println(a/b);
                else
                System.out.println(b/a);
            }
        }
        else if(op=='x')
        {
           System.out.print("Exiting");
           break;
        }
        else {
            System.out.println("invalid output");
        }

    }
    

        //large amoung two
        // System.out.print("enter two numbers ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a>b){
        //     System.out.print(a+" is larger number ");
        // }
        // else
        // System.out.print(b+" is larger number ");
        
        // rupees to dollars
        // System.out.print("enter rupees ");
        // float r = sc.nextFloat();
        // System.out.print(r+" is "+r*0.012f+"dollars");
       
        //fibonacci series
        // System.out.print("Enter a range :");
        // int x=sc.nextInt();
        // int a=0;
        // int b=1;
        // int c=0;

        // while(a<=x)
        // {   
        //     System.out.println(a);
        //     c=a+b;
        //     a=b;
        //     b=c;
        // }

        //palindrome

        // System.out.println("enter string");
        // String str = sc.nextLine();
        // String s2="";
        // for(int i=str.length()-1;i>=0;i--)
        // {
        //     s2=s2+str.charAt(i);
        // }
        // if(str==s2)
        // {
        //     System.out.println("string is palindrome");
        // }
        // else
        // System.out.println("string is not palindrome");

        //armstrong numbers blw range
    //     System.out.print("enter ranges : ");
    //     int k = sc.nextInt();
    //     int l = sc.nextInt();
    //     for(int x=k;x<=l;x++)
    //     {   
    //         int n =x;
    //         int m=x;
    //         int arm=0;
    //         int c=0;
    //     while(m>0)
    //     {
    //         m=m/10;
    //         c++;
    //     }
    //     while(n>0)
    //     {
    //         int a = n%10;
    //         arm=(int)(arm+Math.pow((double)a,c));
    //         n=n/10;

    //     }
       
    //     if(arm==x)
    //     {
    //         System.out.println(x);
    //     }
    // }
    }

}
