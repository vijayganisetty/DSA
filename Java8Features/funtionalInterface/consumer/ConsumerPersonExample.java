package Java8Features.funtionalInterface.consumer;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPersonExample {

    static List<Person> personList = PersonRepository.getAllPersons();

    static Consumer<Person> con1 = (p) -> System.out.println(p);

    static Consumer<Person> con2 = (p) -> System.out.println(p.getName().toUpperCase());

    static Consumer<Person> con3 = (p) -> System.out.println(p.getHobbies());


    static void printNameandHobbies(){
        personList.forEach(con1);
    }

    static void printWithCondition(){
        personList.forEach(p ->
        {
            if(p.getHeight()>120){
                con1.andThen(con2).andThen(con3).accept(p);
            }
        });
    }

    public static void main(String[] args) {

        Person person = PersonRepository.getPerson();

          con1.accept(person);
          con2.accept(person);
          con3.accept(person);

          con1.andThen(con2).andThen(con3).accept(person);

          printNameandHobbies();

          printWithCondition();

    }
}
