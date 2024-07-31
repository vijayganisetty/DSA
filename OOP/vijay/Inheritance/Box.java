package OOP.vijay.Inheritance;

public class Box {

    double l;
    double h;
    double w;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w=-1;
    }

    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }

    Box(double l,double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void information(){
        System.out.println("running");
    }

}
