package Java8Features.optional;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.List;
import java.util.Optional;

public class OptionalBasics {

    static String myName(String name){
        return name;
    }


    // without optional
    static String personName(Person person){
        if(person!=null){
            return person.getName();
        }
        else{
            return "no data found";
        }
    }

    //with optional
    static Optional<String>  getPersonName(Optional<Person> person){
        if(person.isPresent()){
            return person.map(Person::getName);
        }
        else{
            return Optional.empty();
        }
    }

    public static void main(String[] args) {
//        Optional<String> name = Optional.ofNullable(myName("vijay"));
//        System.out.println(name.isPresent() ? name.get() : "no data");

           System.out.println(personName(new Person()));

          System.out.println(getPersonName(PersonRepository.getOptPerson()).isPresent());
          System.out.println(getPersonName(Optional.of(new Person())).isPresent());
    }
}
