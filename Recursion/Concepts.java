class Concepts
{
    static void PrintN(int n)
    {
        if(n==0)
        {
            return;
        }
        else{
            
            PrintN(n-1);
            System.out.print(n+" ");
        }
    }
   
    static void Nprint(int n)
    {
        if(n==0)
        {
            return;
        }
        else{
            System.out.print(n+" ");
            Nprint(n-1);
            System.out.print(n+" ");
        }
    }
    static int Fact(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else{
            return n*Fact(n-1);
        }
    }

    static int sumOfDig(int n)
    {
        if(n<=0)
        {
            return 0;
        }
        else
        {
            return n%10+sumOfDig(n/10);
        }
    }
    static int proOfDig(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        else
        {
            return n%10*proOfDig(n/10);
        }
    }

    static int sum=0;
    static void rev(int n)
    {
        if(n%10==n)
        {
            return ;
        }
        int rem = n%10;
        sum=sum*10+rem;
        rev(n/10);
        
    }

    static int rev2(int n)
    {
        int dig = (int)(Math.log10(n))+1;
        return helper(n,dig);
    }
    
    static int helper(int n,int dig)
    {
        if(n%10==n)
        {
            return n;
        }
        int rem =n%10;
        return rem*(int)(Math.pow(10,dig-1))+helper(n/10,dig-1);

    }
    static boolean pali(int n)
    {
        return n==rev2(n);
    }

    static int c=0;
    static void countZero(int n)
    {
        if(n%10==n)
        {
            return ;
        }
        int rem=n%10;
        if(rem==0)
        {
            c++;
        }
        countZero(n/10);
    }
 
    static int countZeros(int n)
    {
        return helper2(n,0);
    }
    static int helper2(int n, int c)
    {
        if(n==0)
        {
            return c;
        }
        int rem=n%10;
        if(rem==0)
        {
            return helper2(n/10,c+1);
        }
        return helper2(n/10,c);
    }

    static int count(int n)
    {
        int c=0;
        while(n!=0)
        {
            c++;
            if(n%2==0)
            {
                n=n/2;
            }
            else{
                n=n-1;
            }
        }
        return c;
    }

    public static void main(String[] args)
    {
        // Nprint(10);
        // System.out.print(Fact(1));
        // System.out.print(sumOfDig(123));
        // System.out.println(3%810);
        // System.out.print(proOfDig(123));
        // rev(123);
        // System.out.print(sum);
        // System.out.println(rev2(12));
        // System.out.println(pali(212));
        //  countZero(1070);
        //  System.out.println(c);
        // System.out.println(countZeros(10208));
        System.out.println(count(8));
    
    }
}