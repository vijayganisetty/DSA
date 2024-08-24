package OOP.vijay.Interface;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("start media");
    }

    @Override
    public void stop() {
        System.out.println("stop media");
    }
}
