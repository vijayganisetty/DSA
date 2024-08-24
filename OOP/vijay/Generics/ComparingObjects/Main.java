package OOP.vijay.Generics.ComparingObjects;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student kunal = new Student(12,87.58f);
        Student rahul = new Student(13,90.56f);
        Student arya = new Student(14,80.58f);
        Student arun = new Student(15,70.56f);


        if(kunal.compareTo(rahul)<0){
            System.out.println("Rahul has more marks");
        }

        Student[] list = {kunal,rahul,arun,arya};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));





    }

}
