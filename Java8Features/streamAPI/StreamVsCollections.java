package Java8Features.streamAPI;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollections {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("john");
        names.add("adam");
        names.add("ava");

        for(String name : names){
            System.out.println(name);
        }

        Stream<String> stream = names.stream();
        stream.forEach(p -> System.out.println("name : "+p));
     // stream.forEach(p -> System.out.println("name : "+p));  //stream has already been operated upon or closed




    }

}
