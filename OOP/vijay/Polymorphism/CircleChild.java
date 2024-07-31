package OOP.vijay.Polymorphism;

public class CircleChild extends Circle {
    public CircleChild() {
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();
        c.area(2);
    }
}
