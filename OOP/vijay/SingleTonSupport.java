package OOP.vijay;

public class SingleTonSupport {

    public static void main(String[] args) {
       //SingleTon obj = new SingleTon();
        SingleTon obj1 = SingleTon.getInstance();
        SingleTon obj2= SingleTon.getInstance();
        SingleTon obj3= SingleTon.getInstance();
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(SingleTon.c);
//        all  reference are pointing to the same object
    }

}
