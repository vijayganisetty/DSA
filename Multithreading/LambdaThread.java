package Multithreading;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LambdaThread  {

    public static void main(String[] args) throws Exception {

        Runnable r1 = () -> {
            for(int i=0;i<20;i++) {
                System.out.println("hello");
            }
        };

        Runnable r2 = () -> {

            for(int i=0;i<20;i++) {
                System.out.println("hai");
            }
        };

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);

        System.out.println(thread1.getState());
        thread1.start();

        System.out.println(thread1.getState());
       // thread1.sleep(10000);
        System.out.println(thread1.getState());
        thread2.start();
        //0 New
        //1 Runnable (After start)
        //2 Blocked   (At Synchronization)
        //3 Waiting    (Join)
        //4 timed waiting (sleep/time)
        //5 Terminated

    }


}
