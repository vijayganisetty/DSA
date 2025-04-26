package OOP.vijay;

import static java.text.Collator.getInstance;

public class ObjectCreation {

    int a =10;
    String str = "String";
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {

        ObjectCreation obj1 = new ObjectCreation();

        ObjectCreation obj2 = (ObjectCreation) Class.forName("OOP.vijay.ObjectCreation").newInstance();

        ObjectCreation obj3 = (ObjectCreation) obj1.clone();

   //   ObjectCreation obj4 = ObjectCreation.createInstance();


        //serialization and deserialization
    }

}
