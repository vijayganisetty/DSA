package OOP.vijay.Inheritance;

public class Multilevel {

    public static void main(String[] args) {
       GrandChild manoj = new GrandChild();
       father vikram = new father();
       GrandFather arjun = new GrandFather();

       manoj.boxing();
       manoj.swiming();
       manoj.writing();

       vikram.swiming();
       vikram.writing();

       arjun.writing();

    }

    static class GrandFather{

        void writing(){
            System.out.println("writes");
        }
    }
    static class father extends GrandFather{
        void swiming(){
            System.out.println("Swims");
        }
    }
    static class GrandChild extends father{
        void boxing(){
            System.out.println("do boxing");
        }
    }
}
