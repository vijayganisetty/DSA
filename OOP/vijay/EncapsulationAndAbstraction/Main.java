package OOP.vijay.EncapsulationAndAbstraction;


public class Main {

    public static void main(String[] args) {

        Encapsulation device = new Encapsulation(10);

        System.out.println(device.getL());  //Here we can access private member using method
//        System.out.println(device.l);    // we can not access same private member directly

//        A obj = new A(10,"murali");
//        System.out.println(obj.n);
    }
}
