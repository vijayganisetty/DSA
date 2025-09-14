package Java8Features.repo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonRepository {

    public static List<Person> getAllPersons(){
        Person p1 = new Person("jadeja",165,2,13000, Arrays.asList("cricket","singing"));
        Person p2 = new Person("jaishwal",150,0,17000, Arrays.asList("cricket","chess"));
        Person p3 = new Person("rahul",147,1,15000, Arrays.asList("cricket","swimming"));
        Person p4 = new Person("karun",155,1,12000, Arrays.asList("cricket","music"));
        Person p5 = new Person("gill",170,0,18000, Arrays.asList("cricket","cycling"));
        Person p6 = new Person("pant",158,0,16000, Arrays.asList("cricket","coding"));
        Person p7 = new Person("rahman",170,3,18000, Arrays.asList("cricket","cycling"));

        return Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
    }

    public static Person getPerson(){

        return  new Person("Paul", 140,1,3000,Arrays.asList("nothing"));
    }

    public static Optional<Person> getOptPerson(){
        Person person = getPerson();
        person.setAddress(Optional.of(new Address(144,"Bapu Statue","Nehru street","Indhira Nagar","Rajamundry","Andhra Pradesh", 533101L)));
        return Optional.of(person);
    }
}
