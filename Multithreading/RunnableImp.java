package Multithreading;

import static java.lang.Thread.sleep;

public class RunnableImp {

    public static void main(String[] args) throws InterruptedException {
        Employe e1 = new Employe();
        Thread t1 = new Thread(e1);
        t1.start();


        Man m1 = new Man();
        Thread t2 = new Thread(m1);
        t2.start();

        System.out.println(Thread.activeCount());
    }
}

class Employe implements Runnable{

    @Override
    public void run() {
        System.out.println("Employe");
    }
}

class Man implements Runnable{

    @Override
    public void run() {
        System.out.println("man");
    }
}



