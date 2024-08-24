public sealed class SealedClass  permits one,two{

    public void run(){
        System.out.println("running");
    }


    public static void main(String[] args) {

        one obj = new one();
        obj.run();
    }
}

final class one extends SealedClass{

}
final class two extends SealedClass{

}



