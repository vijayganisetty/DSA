package OOP.vijay.StaticExample;

public class Main {

    public static void main(String[] args) {


        Main obj = new Main();
        obj.hello(); // non static in static
    }

    static void fun(){
        System.out.println("fun");
    }
 void hello(){
        fun();  // static in non static
        System.out.println("hello");
    }




}
