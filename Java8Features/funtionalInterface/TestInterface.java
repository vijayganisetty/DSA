package Java8Features.funtionalInterface;

@FunctionalInterface
public interface TestInterface {

    void add();
    
    default  String sayHi(){
        return "hi";
    }

    static boolean isTrue(){
        return true;
    }
}
