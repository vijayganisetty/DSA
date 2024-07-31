package OOP.vijay;

import java.lang.ref.Cleaner;
import java.util.ArrayList;

public class WrapperClass {

    public static void main(String[] args){

        // this is unboxing automatically done by compiler
         ArrayList<Integer> a = new ArrayList<>();
         a.add(25);
         int n = a.get(0);
         System.out.println(n);

         //autoboxing
         char c='a';
         Character ch =c;
        System.out.println(c);
        System.out.println(ch);


       final  A  kapoor = new A("new Kapoor");
        kapoor.name="salman";
        System.out.println(kapoor.name);
        // This is not allowed as A points to the same object which is final
        //kapoor.name = new A("sameer");

        //This is not allowed as it is defined as final
        //kapoor.a=40;
        System.out.println();

        another obj ;

        // this again and again creates new memory , so  unused preexisting  data should destroyed
        for(int i=0;i<10000000;i++){
            obj = new another("nothing");
        }

        //this re assigns same value , no extra memory is used
        another obj2=new another();
        for(int i=0;i<10000000;i++){
           obj2.name="nothing";
        }



    }

       static  class A {
           final int a = 10;
           String name;

           public A(String name) {
               this.name = name;
           }
       }
        static class another {
          String name;

          another(){
              this.name=null;
          }
          another(String name){
              this.name=name;
          }

//            @Override
//            protected void finalize() throws Throwable {
//                super.finalize();
//                System.out.println("objects destroyed");
//            }

        }
}

