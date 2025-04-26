package OOP.vijay.Interface;

public class Car implements  Engine,Media{

    @Override
    public void start() {
        System.out.println("Start the car");
    }

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }

    @Override
    public void acc() {

        System.out.println("accelerate the car");

    }
}
