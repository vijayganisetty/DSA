package Java8Features.optional;

import Java8Features.repo.Address;
import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.Optional;

public class MethodsInOptional {


    static void orElse(){
         Optional<Person> person = PersonRepository.getOptPerson();
     //  String name = person.isPresent() ? person.get().getName() :"No data found";
         String name = person.map(Person :: getName).orElse("Data not found");
         System.out.println(name);
    }

    static void  orElseGet(){
        Optional<Person> person = PersonRepository.getOptPerson();
        String name = person.map( Person :: getName).orElseGet(()-> {
            // Initiate a notification
            return "data not found";
        }
        );
        System.out.println(name);
    }

    static void orElseThrow(){
        Optional<Person> person = PersonRepository
                .getOptPerson();
        String name = person.map(Person :: getName).orElseThrow(() -> new RuntimeException());
        System.out.println("data not found");

    }

    static void optionalMapExample(){
        Optional<Person> person = PersonRepository.getOptPerson();

        if (person.isPresent()){
            Optional<Address> add =   person.flatMap(x -> x.getAddress());
            System.out.println(add.get());
        }
        person.ifPresent(per ->
                {
                    String name =  person.map(Person::getName).orElse("No data found");
                    System.out.println("name :"+name);
                }
        );
    }



    public static void main(String[] args) {

        // may or may not be null
        // accepts nulls and  while using we must check isPresent
        Optional<String>  ofNullable = Optional.ofNullable("java8");
        System.out.println(ofNullable.isPresent() ? ofNullable.get() : Optional.empty());

        ofNullable.ifPresent( x -> System.out.println(x.toUpperCase()));

        //Data must be always not null
        Optional<String> of = Optional.of("Java");
        System.out.println(of);

        // Return empty instance of an Optional
        System.out.println(Optional.empty());

        orElse();
        orElseGet();
        orElseThrow();

        optionalMapExample();
    }
}
