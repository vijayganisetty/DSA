package Java8Features.funtionalInterface.consumer;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    static BiConsumer<Integer,Integer> bicon1 = (a, b) -> System.out.println("Add : "+(a+b));

    static void simpleCal(){

        BiConsumer<Integer,Integer> c1 = (a,b) -> {
            System.out.println("Addition  :"+(a+b));
        };
        BiConsumer<Integer,Integer> c2 = (a,b) -> {
            System.out.println("Subtraction  :"+(a-b));
        };
        BiConsumer<Integer,Integer> c3 = (a,b) -> {
            System.out.println("Division  :"+(a/b));
        };

        c1.andThen(c2).andThen(c3).accept(6,2);
    }

    static void personExample(){

        BiConsumer<String, Integer> con = (s,i) -> System.out.println(s +" "+i);

        List<Person> personList = PersonRepository.getAllPersons();

        personList.forEach(p -> con.accept(p.getName(),p.getHeight()));
    }

    static  void  biconsumerDiffArgs(){

        BiConsumer<String, Integer> con1 = (s,i) -> System.out.println(s +" "+i);

        BiConsumer<String, Double> con2 = (s,i) -> System.out.println(s +" "+i);

        List<Person> personList = PersonRepository.getAllPersons();

        personList.forEach(p ->{
            con1.accept(p.getName(), p.getKids());
            con2.accept(p.getName(), p.getSalary());
        });
    }

    public static void main(String[] args) {

        bicon1.accept(1,2);

        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,6);

        BiConsumer<List<Integer>,List<Integer>> con2 = (l1,l2) -> {
            if(l1.size() == l2.size()){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        };
        con2.accept(list1,list2);

        simpleCal();

        personExample();

        biconsumerDiffArgs();

    }

}
