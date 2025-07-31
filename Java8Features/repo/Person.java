package Java8Features.funtionalInterface.repo;

import java.util.ArrayList;
import java.util.List;


public class Person {

    private  String name;
    private int height;
    private double salary;
    private int kids;
    private List<String> hobbies = new ArrayList<>();

    public Person(String name, int height, int kids, double salary, List<String> hobbies) {
        this.name = name;
        this.height = height;
        this.kids = kids;
        this.salary = salary;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", salary=" + salary +
                ", kids=" + kids +
                ", hobbies=" + hobbies +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getKids() {
        return kids;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
