package Java8Features.funtionalInterface.predicate;


import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

//Combined example of predicate and consumer
public class PredicateAndConsumer {

    static Predicate<Person> pre = (p) -> p.getHeight()>150;

    static BiConsumer<String, List<String>> cons  = (name, hobbies) -> System.out.println(name+" "+hobbies);

    static Consumer<Person>  con  = (c) -> {
      if(pre.test(c)){
          cons.accept(c.getName(),c.getHobbies());
      }
    };

    public static void main(String[] args) {

        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(con);

    }
}
