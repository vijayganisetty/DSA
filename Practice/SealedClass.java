package Practice;

public sealed class SealedClass  permits one,two{

    public void run(){
        System.out.println("running");
    }


    public static void main(String[] args) {

        //Logger logger = Logger.getLogger(String.valueOf(Practice.SealedClass.class));

       // logger.info("hello");

        one obj = new one();
        obj.run();
    }
}

final class one extends SealedClass{

}
final class two extends SealedClass{

}



