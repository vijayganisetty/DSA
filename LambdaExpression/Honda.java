package LambdaExpression;

import java.util.Scanner;

public class Honda implements Car{
    @Override
    public void drive() {
        System.out.println("Driving honda");
    }
    public static void main(String[] args) {

        //werbose
        Honda car1 = new Honda();
        car1.drive();

        //Anonymous Object
        new Car(){
            @Override
            public void drive() {
                System.out.println("driving car");
            }
        }.drive();


        //lambda expression
        Car car3 = () -> {
                            System.out.println("Lambda implementation ");
                            int speed= new Scanner(System.in).nextInt();
                            if(speed<100){
                                System.out.println("normal driving");
                            }
                            else{
                                System.out.println("rash driving");
                            }
                          };
        car3.drive();

    }



}
