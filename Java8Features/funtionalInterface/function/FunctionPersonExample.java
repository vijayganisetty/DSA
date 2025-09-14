package Java8Features.funtionalInterface.function;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionPersonExample {

    static Function<List<Person>, Map<String,Integer>> fun2 = (p)  -> {
        Map<String, Integer> map = new HashMap<>();

        p.forEach( per ->{
            if(per.getKids() >1)
                map.put(per.getName(), per.getHeight());
        });
        return map;
    };

    public static void main(String[] args) {

        List<Person> personList = PersonRepository.getAllPersons();

        System.out.println(fun2.apply(personList));
    }
}
