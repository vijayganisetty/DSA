package DSA_Bootcamp.arrayBasics;

public class FactorialRecursive {

    static int fact(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    static int bruteForce(int n) {

        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println(bruteForce(5));
        System.out.println(fact(5));

    }
}
