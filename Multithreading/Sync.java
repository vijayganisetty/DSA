package Multithreading;

public class Sync {

    public static void main(String[] args) throws InterruptedException {

        spam sp = new spam();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000000;i+=50){
                    sp.incrementid();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000000;i+=50){
                    sp.incrementid();
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000000;i+=50){
                    sp.incrementid();
                }
            }
        });



        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(sp.id2);
        System.out.println(sp.id);


    }

}

class spam {
    int id =0;
    int id2=0;
     synchronized   public void incrementid(){
        id+=20;
        id2+=20;
    }
}
