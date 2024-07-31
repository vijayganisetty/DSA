package OOP.vijay.Polymorphism;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Shape sh = new Shape();
        Shape shape = new Circle();
        Circle circle = new Circle();
        Square square = new Square();
        sh.area();
        shape.area();
        circle.area();
        square.area();
    }
}