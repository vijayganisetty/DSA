package OOP.vijay;

import OOP.vijay.WrapperClass.A;

public class ObjectDemo {

    int num;
    public ObjectDemo(int num) {
        this.num = num;
    }

    public int hashCode(){
        return super.hashCode();
    }

    public boolean equals(Object obj){
        return super.equals(obj);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString(){
        return super.toString();
    }

//    @Override
//    protected void finalize(){
//        super.finalize();
//    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(20);
        System.out.println(obj.hashCode());
        System.out.println(obj.hashCode());

        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj.getClass());
    }


}
