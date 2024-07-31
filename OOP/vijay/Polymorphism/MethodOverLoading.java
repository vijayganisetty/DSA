package OOP.vijay.Polymorphism;

class MethodOverLoading {
    int l;
    int b;

         MethodOverLoading() {
        int l = 0;
        int b = 0;
    }

    MethodOverLoading(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();

        MethodOverLoading obj2 = new MethodOverLoading(1,5);

        System.out.println(obj.b + " "+obj.l);
        System.out.println(obj2.b + " "+obj2.l);


    }
}