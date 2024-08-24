package OOP.vijay.Interface;

public class NiceCar {

    private  final Engine engine;
    private final Media player = new CDPlayer();

    public  NiceCar(){
        engine = new PowerEngine();
    }

//    public NiceCar(Engine engine) {
//        this.engine = engine;
//    }

    public  void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start();
    }
    public  void stopMusic(){
        player.stop();
    }


}
