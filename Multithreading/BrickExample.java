package Multithreading;

public class BrickExample {

    //Race Condition
    public static void main(String[] args) throws Exception{

        BrickDairy bd = new BrickDairy();
        Runnable r1 = () -> {
            for (int i=0;i<100000;i+=50){
                 bd.incrementBrickCount();
            }
        };
        Runnable r2 = () -> {
            for (int i=0;i<150000;i+=50){
                bd.incrementBrickCount();
            }
        };
        Runnable r3 = () -> {
            for (int i=0;i<50000;i+=50){
                bd.incrementBrickCount();
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(bd.brickCount);
        System.out.println(bd.brickCount2);

    }
}

class BrickDairy{

             int brickCount=0;
             int brickCount2=0;

   synchronized public void incrementBrickCount(){

            brickCount += 50;
            brickCount2 += 50;

//        synchronized(this) {
//            brickCount += 50;
//        }
    }
}

