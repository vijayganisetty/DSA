package OOP.vijay.StaticExample;

public class StaticBlock {

    static  int  a=10;

    static  int b;

    static{
        System.out.println("Inside the static block");
        b=5*a;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a);
        System.out.println(StaticBlock.b);
        StaticBlock.b+=5;
        System.out.println(StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.b);

    }



}
