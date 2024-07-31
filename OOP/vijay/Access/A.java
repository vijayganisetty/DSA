package OOP.vijay.Access;

public  class A {
//    private int n;
//   private String s;
//   private   int[] num;

     int n;
    private String s;
    private   int[] num;


    public A(int n, String s) {
        this.n = n;
        this.s = s;
        this.num = new int[n];
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    private static class B{
        int n;
    }

    public static void main(String[] args) {
        A obj2= new A(20,"rohit");
        System.out.println(obj2.n);

        A.B obj3 = new B();
    }
}


//class MainOne{
//    public static void main(String[] args) {
//        A obj2= new A(20,"rohit");
//        System.out.println(obj2.n);
//
//    }
//
//}

