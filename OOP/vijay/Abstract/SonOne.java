package OOP.vijay.Abstract;

public class SonOne extends Parent{

    public SonOne(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("coder");
    }

    @Override
    void partner() {
        System.out.println("i love devi she is 25");
    }
}
