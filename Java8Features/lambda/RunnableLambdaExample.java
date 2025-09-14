package Java8Features.lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        //Before
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        };

        new Thread(t1).start();

        //After
        Runnable t2 = () -> System.out.println("Thread 2");
        new Thread(t2).start();

        //before
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 4");
            }
        }).start();

        //after
        new Thread( () -> System.out.println("Thread 5")).start();
    }
}
