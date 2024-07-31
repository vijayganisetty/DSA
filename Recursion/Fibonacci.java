public class Fibonacci {
    
    //recursion
    static int fibo(int n)
    {
     if(n<2)
     {
        return n;
     } 
     else{
        return fibo(n-1)+fibo(n-2);
     }
    }

    static int fiboFormula(int n)
    {

        return    (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        
    } 
    public static void main(String[] args)
    {
        System.out.println(fiboFormula(9));
    }
}
