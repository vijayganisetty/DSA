public class LevelOne {
    
    static void nTo1(int n)
    {
        if(n==0)
        {
            // System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        nTo1(n-1);
    }
    static void oneToN(int n)
    {
        if(n==0)
        {
            // System.out.print(n);
            return;
        }
         oneToN(n-1);
        System.out.print(n+" ");
       
    }

    static void ntoonentoone(int n)
    {
        if(n==0)
        {
            return ;
        }
        System.out.print(n+" ");
        ntoonentoone(n-1);
        System.out.print(n+" ");

    }

    static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n*fact(n-1);

    }
    static int NSum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+NSum(n-1);

    }
     static int SumOfDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n%10+SumOfDigits(n/10);
    }

      static int productOfDigits(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return n%10*productOfDigits(n/10);
    }

    static int reverse(int n)
    {
       if(n%10==n)
       {
        return n;
       }
       return n%10+reverse(n/10);
    }


    public static void main(String[] args)
    {

        // nTo1(10);
        // System.out.println();
        // oneToN(10);
        // System.out.println();
        // ntoonentoone(5);
        //  System.out.println();
        // System.out.println(fact(5));
        // System.out.println();
        // System.out.println(NSum(10));
        // System.out.println(SumOfDigits(132));
        // System.out.println(productOfDigits(132));
        System.out.print(reverse(123));
    }
}
