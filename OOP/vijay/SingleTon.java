package OOP.vijay;

public class SingleTon {
    public static int c=0;
    private SingleTon(){
        c++;
    }

    private static SingleTon instance;

    static SingleTon getInstance(){
        if(c==0){
            return new SingleTon();
        }
        return instance;
    }
}
