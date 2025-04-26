package Practice;

public class sieveOfEratosheses {
    

    public static void main(String[] args){
        int n=20;

        boolean[] primes = new boolean[n+1];

        method(n,primes);
    }

    private static void method(int n, boolean[] primes) {
        
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                 System.out.println(i);
            }
        }
    }
}
