package OOP.vijay.Inheritance;

public class Hierarchical {

    public static void main(String[] args) {

        Human human = new Human();
        human.works();
        human.eats();

        Dog dog = new Dog();
        dog.barks();
        dog.eats();



    }

    static class Animal{

        void eats(){
            System.out.println("eating");
        }

    }

    static class Lion extends Animal{

        void hunts(){
            System.out.println("hunts");
        }
    }

    static class Dog extends Animal{
        void barks() {
            System.out.println("barks");
        }

    }
    static class Human extends Animal{
        void works(){
            System.out.println("works");
        }
    }

}
