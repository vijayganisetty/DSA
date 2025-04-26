package AnonymousObject;

public class Student {
    String name = "vijay";

    public void greet(){
        System.out.println("Hai "+name);
    }

    public static void main(String[] args) {

//        Student s1 ;
//        s1 = new Student();
//        s1.greet();

           new Student().greet();
    }

}
