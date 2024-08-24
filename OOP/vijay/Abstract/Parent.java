package OOP.vijay.Abstract;

public abstract class Parent {

    int age;

    final int num ;

    public Parent(int age) {
        this.age = age;
        this.num = 129;
    }

    static void hello(){
        System.out.println("hello");
    }

    void normal(){
        System.out.println("normal");
    }

    abstract void career();
    abstract void partner();
}
