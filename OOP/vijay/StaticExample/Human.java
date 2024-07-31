package OOP.vijay.StaticExample;

public class Human {

    int age;
    String name;
    int salary;
    boolean married;
    static int population;


    public Human(int age,String name,int salary,boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
    }

    public static void main(String[] args) {

        //every time a new obj is added the population is increased by one

        Human manoj = new Human(20,"Manoj",20000,false);
        System.out.println(Human.population);
        Human hari = new Human(20,"hari",20000,false);
        System.out.println(Human.population);

    }


}
