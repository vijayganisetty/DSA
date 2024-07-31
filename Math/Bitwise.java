package Math;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bitwise {
    
    static boolean oddEven(int n)
    {
    if((n & 1)==1)
    {
      return false;
    }
       
    return true;
    }

    static int findunique(int[] a)
    {
      int unq=0;
      for(int x : a)
      {
        unq ^=x;
      }
      return unq;
    }

  static int signedUnique(int[] a)
  {
  int ans=0;
  for(int i: a)
  {
     ans+=i;
  }
  return ans;
  }

  static int ithBit(int a,int n)
  {
    return a & (1<<(n-1));
  }

  static int nthMagic(int n)
  {
   int ans=0;
   int base=5;
   while(n>0)
   {
    int x=n&1;
    ans+=x*base;
    n=n>>1;
    base=base*5;
   }
   return ans;
  }

  static int noOfDigits(int n)
  {
    // int c=0;
    // while(n>0)
    // {
    //   c++;
    //   n=n>>1;
    // }
    int base=10;
    int ans=(int) (Math.log(n)/Math.log(base))+1;
     return ans;
  }
  
  static boolean powerOfTwo(int n)
  {

    if(n >0 && (n&(n-1))==0 )
    {
      return true;
    }
    return false;

  }

  static int FindPower(int b,int p)
  {
    int ans=1;
    while(p>0)
    {
      if((p&1)==1)
      {
        ans*=b;
      }
      b*=b;
      p=p>>1;
    }
    return ans;
  }

  static int findSet(int n)
  {
    int ans=0;
    // while(n>0)
    // {
    //   if((n&1)==1)
    //   {
    //     ans++;
    //   }
    //   n=n>>1;
    // }
    while(n>0)
    {
      ans++;
      n-=(n&-n);
    }
    return ans;
  }

  static int xor(int a)
  {
     if(a%4==0)
     {
      return a;
     }
     if(a%4==1)
     {
      return 1;
     }
     if(a%4==2)
     {
      return 2;
     }
     if(a%4==3)
     {
      return 3;
     }
     return 0;
  }

  static void RangeXOR()
  {
    int a=3;
    int b=9;

    int ans=xor(b)^xor(a-1);
    System.out.print(ans);

  }
  static void fliparray(int[][] a)
  {
    int l = a[0].length;
   for(int i=0;i<a.length;i++)
   {
     for(int j=0;j<l/2;j++)
     {
      int temp=a[i][j];
      a[i][j]=a[i][l-1-j];
      a[i][l-1-j]=temp;
     }
    }
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
  }
  static boolean primenum(int n)
  { 
    if(n<=1)
    {
      return false;
    }
    for(int i=2;i*i<=n;i++)
    {
       if(n%i==0)
       {
        return false;
       }
    }
      return true;
  }

  static void nPrimes(int n)
  {
    int count=0;
    for(int i=2;i<=n;i++)
    {
      count=0;
     for(int j=2;j*j<=i;j++)
     {
      if(i%j==0)
      {
        count++;
      }
     }
     if(count==0)
     {
      System.out.print(i+" ");
     }
    }
  }

  static void sieve(int n,boolean[] primes)
  {
      for(int i=2;i*i<=n;i++)
      {
        if(!primes[i])
        {
          for(int j=i*2;j<=n;j+=i)
          {
            primes[j]=true;
          }
        }
      }
      for(int i=2;i<=n;i++)
      {
        if(!primes[i])
        {
          System.out.print(i+" ");
        }
          
      }
  }

  static int[] countbits(int n)
  {
    int[]  ans = new int[n+1];
    for(int i=0;i<=n;i++)
    {
        int count=0;
        int x=i;
        while(x!=0)
        {
            if((x&1)==1)
            {
                count++;
            }
            x=x>>1;;

        }
        ans[i]=count;
    }
    return ans;
    }

    static int countPrimeBits(int l,int r)
    {
        int ans=0;
         int count=0;
         int c=0;
        for(int i=l;i<=r;i++)
        {
            int n=i;
            count=0;
            while(n!=0)
            {
             if((n&1)==1)
             {
                 count++;
             }
             n=n>>1;
            }
            c=0;
            for(int j=1;j<=count;j++)
            {
                if(count%j==0)
                {
                   c++;
                }
            }
            if(c==2)
            {
                ans++;
            }
        }
        return ans;   
    }
    public static void main(String[] args)
    {
        // System.out.print(oddEven(10));
        // int[] a = {1,2,3,4,-4,-2,-1};
        //  System.out.print(findunique(a));
        // System.out.print(signedUnique(a));
        // int a=10110110;
        // int n=4;
        // System.out.print(ithBit(a, n));

        // System.out.print(FindPower(3,6));
        //  System.out.print(findSet(9));
        // RangeXOR();
        // int[][] a={{1,0,0},{1,1,0},{0,0,1}};
        // fliparray(a);
        int x = 2;
        String str="";
        // while(x>0)
        // {
        //  str+=x&1;
        //  x=x>>1;
        // }
        // System.out.print(str);
        // int n=40;
        // boolean[] primes = new boolean[n+1];
        // sieve(n,primes);

        // System.out.print(Arrays.toString((countbits(5))));
        System.out.print("prime set bits are "+countPrimeBits(6, 10));

    }
}
