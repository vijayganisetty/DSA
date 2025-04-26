package OOP.vijay.Cloning;

public class Human implements Cloneable {
    int age ;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7};
    }

//    public Human(Human other){
//        this.age=other.age;
//        this.name = other.name;
//    }

//    @Override
//    public Human clone() {
//        try {
//            Human clone = (Human) super.clone();
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError();
//        }
//    }


    @Override
    public Object clone() throws CloneNotSupportedException{
        //Shallow copy
        Human twin = (Human) super.clone();

        //deep copy
        twin.arr = new int[twin.arr.length];

        for(int i=0;i<twin.arr.length;i++)
        {
            twin.arr[i]= this.arr[i];
        }
   return twin;

    }


}
