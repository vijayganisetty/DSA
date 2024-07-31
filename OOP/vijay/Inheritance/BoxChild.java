package OOP.vijay.Inheritance;

public class BoxChild extends Box{
    double weight;

    public BoxChild(){
        this.weight=-1;
    }

    public BoxChild(double weight){
        this.weight = weight;
    }
    public BoxChild(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
