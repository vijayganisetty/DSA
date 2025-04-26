package Basics;
public class SieveOfEratosthenes {
    
    // to find n primes of to count n primes
    // time complixity is  O(n*log(logn));
    // space complixity is O(n) auxilary space (extra space)
    static void solution(int n,boolean[] primes)
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
    public static void main(String[] arags)
    {
       int n =400;
       //as primes start with 2 , so index 0,1 negleted so
       //size must be n+1 
       boolean[] primes=new boolean[n+1];
       solution(n, primes);
    }
}
