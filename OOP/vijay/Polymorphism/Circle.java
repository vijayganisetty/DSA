package OOP.vijay.Polymorphism;

public class Circle extends Shape {


    @Override
    void area(){
        System.out.println("Area is pi *r*r");
    }

     void area(int i) {
        System.out.println("Area is"+Math.PI*i*i);
    }
}

