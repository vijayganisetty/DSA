package OOP.vijay.Inheritance;

public class Single {

    public static void main(String[] args) {
        Single.child kiran = new Single.child(20,"kiran",5);
        kiran.hobby();
    }
     static   class father{

        int age;
        String name;

        father(int age , String name){
            this.age=age;
            this.name=name;
        }
            void hobby(){
            System.out.println("swimming");
        }
    }

       static class child extends father{
        int friends;

        child(int age , String name,int friends){
            super(age,name);
            this.friends=friends;
        }
        void hobby(){
            System.out.println("boxing");
            super.hobby();
        }

    }
}
