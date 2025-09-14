package Java8Features.funtionalInterface.predicate;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.List;
import java.util.function.Predicate;

public class PredicatePersonExample {

   static Predicate<Person> p1 = (p) -> p.getSalary()>1200;

   static Predicate<Person> p2 = (p) -> p.getKids() ==2;

   public static void main(String[] args) {

       List<Person> personList = PersonRepository.getAllPersons();

     List<Person> result =  personList.stream()
               .filter(p1)
               .toList();

       for(Person p : result){
           System.out.println(p);
       }

    personList.forEach(person -> {
        if(p2.test(person)){
            System.out.println(person);
        }
    });
    }
}
