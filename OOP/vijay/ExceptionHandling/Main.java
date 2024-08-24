package OOP.vijay.ExceptionHandling;

public class Main {

    public static void main(String[] args) {

        int a=5;
        int b=0;

try {
//    divide(a, b);
    String name="we";
    if(name.equals("we")){
        throw new MyException("we");
    }
}
       catch (MyException e){
         System.out.println(e.getMessage());
         }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }


finally {
            System.out.println("i am executed");
        }
    }

    static   int divide(int a,int b) throws ArithmeticException{
       if( b==0 ){
           throw new ArithmeticException("custom exception");
       }
        return a/b;
    }
}

