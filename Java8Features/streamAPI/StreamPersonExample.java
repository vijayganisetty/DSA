package Java8Features.streamAPI;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPersonExample {

    public static void main(String[] args) {

    /*    Predicate<Person> p1 = (p) -> p.getKids()>0;

        Predicate<Person> p2 = (p) -> p.getHeight()>150;

        Map<String, List<String>> personMap = PersonRepository
                .getAllPersons()
                .stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Person::getName, Person :: getHobbies));

        System.out.println(personMap.size());
        personMap.forEach((s,p) -> System.out.println(s+" "+p));
      */

        Function<Person,List<String>> fun  = p -> p.getHobbies();

      List<String>  hobbiesList =  PersonRepository
              .getAllPersons() //List of Persons
              .stream() // Stream of persons
              .map(Person :: getHobbies) // Stream List of String
              .flatMap(List :: stream) // Stream of string
              .distinct() //Remove duplicates
              .toList(); // Collecting to list
        System.out.println(hobbiesList);

    }
}
