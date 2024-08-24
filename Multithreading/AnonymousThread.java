package Multithreading;

public class AnonymousThread {

    public static void main(String[] args) {

//        new Runnable() {
//
//            public void run() {
//                System.out.println("hello");
//            }
//        };

        Runnable r2 = new Runnable() {
            public void run() {
                System.out.println("hai");
            }
        };

        // Anonymous
        Thread thread1 = new Thread(new Runnable() {

            public void run() {
                System.out.println("hello");
            }
        });
        thread1.start();

        Thread thread2 = new Thread(r2);
        thread2.start();

        System.out.println(Thread.activeCount());
    }

}
