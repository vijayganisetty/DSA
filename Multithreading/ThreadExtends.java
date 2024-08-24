package Multithreading;

public class ThreadExtends {

    public static void main(String[] args) {

        Employee emp = new Employee();


        Manager mng = new Manager();
        mng.start();

        System.out.println( Thread.activeCount());
    }
}

class Employee extends Thread{

    @Override
    public void run(){

        System.out.println("hell0"+Thread.currentThread().getName()+" "+Thread.currentThread().getId());

    }
}

class Manager extends Thread{


    @Override
    public void run(){

        System.out.println("hi"+Thread.currentThread().getName()+" "+Thread.currentThread().getId());

    }
}