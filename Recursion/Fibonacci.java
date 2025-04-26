package Recursion;
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

    static int fact(int n){
        if(n<=1){
            return  1;
        }
        else {
            return n * fact(n - 1);
        }
    }

     static void rev(String input,String output){
        if(input.isEmpty()){
        System.out.println(output);
        return;
    }
    int x = input.length()-1;

    rev(input.substring(0, x),output+input.charAt(x));

}
    static int fiboFormula(int n)
    {

        return  (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
        
    } 
    public static void main(String[] args)
    {
//        rev("vijay","");
        String str = "vijay durga prasad";

         String s = str.replace(" ","");
        System.out.println(s);
         for(int i=3;i<s.length()-1;i+=5){
             System.out.println(s.charAt(i)+" "+i);

         }


//        System.out.println(fibo(9));
//
//        System.out.println(fact(5));
    }
}
