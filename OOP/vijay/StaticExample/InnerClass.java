package OOP.vijay.StaticExample;

 public class InnerClass {

     static class InsideClass{
            String n;

              InsideClass(String n){
                  this.n=n;
           }

           @Override
           public String toString(){
                  return this.n;
           }

     }

     public static void main(String[] args) {
         InsideClass obj = new InsideClass("ravi");
         InsideClass obj2 = new InsideClass("rana");

         System.out.println(obj);
         System.out.println(obj.n);
         System.out.println(obj2.n);


//         InsideClass.sample(10);
//         String[] arg ={"one","two"};
//         AnotherClass.main(arg);
     }
}

 class AnotherClass{

     public static void main(String[] args) {
         System.out.println(args[0]);
         System.out.println("another class");
     }


}

