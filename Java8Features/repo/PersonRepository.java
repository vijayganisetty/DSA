package Java8Features.funtionalInterface.repo;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {

    public static List<Person> getAllPersons(){
        Person p1 = new Person("john",165,2,2000, Arrays.asList("cricket","music"));
        Person p2 = new Person("ram",120,1,1200, Arrays.asList("cricket","chess"));
        return Arrays.asList(p1,p2);
    }

    public static Person getPerson(){

        return  new Person("Paul", 140,1,3000,Arrays.asList("nothing"));
    }
}
