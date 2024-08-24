package OOP.vijay.Abstract;

public class Main {

    public static void main(String[] args) {
        SonOne ray = new SonOne(15);
        ray.career();
        ray.partner();
        ray.normal();


        SonTwo ram = new SonTwo(23);
        ram.career();
        ram.partner();

        Parent.hello();
    }
}
