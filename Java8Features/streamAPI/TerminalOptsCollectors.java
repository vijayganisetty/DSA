package Java8Features.streamAPI;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class TerminalOptsCollectors {

    static List<String> mappingName() {
        return PersonRepository
                .getAllPersons()
                .stream()
                .map(Person::getName)
                .toList();
    }

    static void groupingOneArg(){
        Map<Integer, List<Person>>  list =  PersonRepository
                .getAllPersons()
                .stream()
                .collect(groupingBy(Person :: getKids));
        Stream.of(list).forEach(System.out::println);
    }

    static void groupingTwoArgs(){
        Map<Integer,Map<String, List<Person>>>  list =  PersonRepository
                .getAllPersons()
                .stream()
                .collect(groupingBy(Person::getKids, groupingBy(per -> per.getHeight() >= 150 ? "Tall" : "short")));
        Stream.of(list).forEach(System.out :: println);
    }

    static void partitionByHeight(){
        Map<Boolean,List<Person>> list = PersonRepository
                .getAllPersons()
                .stream()
                .collect(partitioningBy(x-> x.getHeight()>150));
        Stream.of(list).forEach(System.out::println);
    }
 static void partitionByHeightTwoArg(){
        Map<Boolean, Set<Person>> list = PersonRepository
                .getAllPersons()
                .stream()
                .collect(partitioningBy(x-> x.getHeight()>150, Collectors.toSet()));
        Stream.of(list).forEach(System.out::println);
    }

    public static void main(String[] args) {

        //Joining
        String joiningNoArg = Stream.of("one", "two", "three")
                .collect(Collectors.joining());
        System.out.println(joiningNoArg);

        String joiningOneArg = Stream.of("one", "two", "three")
                .collect(Collectors.joining("-"));
        System.out.println(joiningOneArg);

        String joiningThree = Stream.of("one", "two", "three")
                .collect(Collectors.joining("-", "[", "]"));
        System.out.println(joiningThree);


        //Mapping
        mappingName().forEach(System.out::println);

        PersonRepository
                .getAllPersons()
                .stream()
                .collect(mapping(Person::getName, Collectors.toList())).forEach(System.out::println);

        int kidscount = PersonRepository
                .getAllPersons()
                .stream()
                .map(Person::getKids)
                .mapToInt(x -> x)
                .sum();
        System.out.println("Total kids " + kidscount);

        int sum = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .collect(summingInt(x -> x.intValue()));
        System.out.println(sum);

        double avg = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                .collect(averagingInt(x -> x.intValue()));
        System.out.println(avg);

        groupingOneArg();
        groupingTwoArgs();

        partitionByHeight();
        partitionByHeightTwoArg();

    }
}
