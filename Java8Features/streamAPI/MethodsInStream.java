package Java8Features.streamAPI;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.*;
import java.util.stream.Collectors;

public class MethodsInStream {

    public static void main(String[] args) {

        // peek usage ->
        List<String> personNames = PersonRepository
                .getAllPersons()
                .stream()
                .peek(person -> System.out.println(person)) // peek is used to debug
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(personNames);

        // map usage
        List<String> fruits = Arrays.asList("Apple","Banana","Orange");
                 fruits.stream()
                .map(s -> s.length())
                .collect(Collectors.toList()).forEach(x -> System.out.println(x));

        //sum of even numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        int sum = numbers
                .stream()
                .filter(x ->( x%2==0))
                .reduce(0,(a,b) -> a+b);
//                .mapToInt(x -> x)
//                .sum();
        System.out.println("sum of even numbers :"+sum);

        //get names of the persons and convert to uppercase
        PersonRepository.getAllPersons()
                .stream()
                .map(x -> x.getName())
                .map(x -> x.toUpperCase()).toList().forEach(System.out::println);

        Set<String> namesInSet = PersonRepository
                .getAllPersons()
                .stream()
                .map( Person :: getName)
                .map(String :: toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(namesInSet);

        //flatmap
        List<Integer> odd = Arrays.asList(1,3,5,7,9);
        List<Integer> even = Arrays.asList(2,4,6,8,10);
        List<List<Integer>> listOfList = Arrays.asList(odd,even);
        System.out.println("Before flatten : "+ listOfList);

        List<Integer> flattenList = listOfList
                .stream()
                .flatMap(x -> x.stream())
                .toList();
        System.out.println("After flatten :" + flattenList);

        // unique hobbies in the person
        List<String> uniqueHobbies = PersonRepository
                .getAllPersons()
                .stream()
                .map(Person :: getHobbies)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        System.out.println(uniqueHobbies);

        //Custom sort
        List<String> customSort = PersonRepository
                .getAllPersons()
                .stream()
                .sorted(Comparator.comparing(Person::getName))
               // .sorted(Comparator.comparing(Person::getName).reversed())
                .map(Person :: getHobbies)
                .flatMap(List::stream)
                .distinct()
                .toList();
        System.out.println(customSort);


        //filter
        List<String> namesList = PersonRepository
                .getAllPersons()
                .stream()
                .map(s -> s.getName())
                .filter(x -> x.length()>5)
                .collect(Collectors.toList());
        System.out.println(namesList);

        //filter
        List<Person> personList = PersonRepository
                .getAllPersons()
                .stream()
                .filter(x -> x.getKids()>0)
                .collect(Collectors.toList());
        personList.forEach(System.out::println);

        //Reduce
        int res =  Arrays.asList(1,2,3,4,5)
                  .stream()
                  .reduce(1,(a,b)-> a*b);
        System.out.println(res);

        String nm = PersonRepository
                .getAllPersons()
                .stream()
                .map( x -> x.getName())
                .reduce("",(a,b) -> a.concat(b));
        System.out.println(nm);

        //tallest person
        Optional<Person> tallPerson = PersonRepository
                .getAllPersons()
                .stream()
                .reduce((x,y) -> x.getHeight()>y.getHeight() ? x:y);
        System.out.println(tallPerson.get());

        //chain all in one (stream,map,filer,reduce
        // Use reduce to find total kids of the persons
        int kids = PersonRepository
                .getAllPersons()
                .stream()
                .filter(x -> x.getHeight()>150)
                .map(x -> x.getKids())
        //        .reduce(0,Integer::sum)
                .reduce(0,(a,b) -> a+b);
        System.out.println("Total kids in the person repo :"+kids);

        // minBy and MaxBy
        //

        System.out.println("Short person :"+shortestPerson());
        System.out.println("tallest person : "+getTallPerson());
        System.out.println("multiple tall persons"+multipleTops());



        List<String> somefruits = Arrays.asList("apple","banana","orange","grape");
        //limit
        somefruits.stream().limit(2).forEach(x-> System.out.println(x));
        //skip
        somefruits.stream().skip(2).forEach(x-> System.out.println(x));

    }

    static List<Person> multipleTops(){
        List<Person> list = new ArrayList<>();
        Person tall = getTallPerson();
        if(Objects.nonNull(tall)){
           list = PersonRepository
                    .getAllPersons()
                    .stream()
                    .filter(x -> x.getHeight()==tall.getHeight())
                    .toList();
        }
        return  list;
    }

    static Person shortestPerson(){
        Person shortPer = PersonRepository
                .getAllPersons()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Person::getHeight))).get();
        System.out.println(shortPer);
            return  shortPer;
    }

    static Person getTallPerson(){
        Person tall = PersonRepository
                .getAllPersons()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Person::getHeight))).get();
        System.out.println("tallest person->"+tall);
        return tall;
    }
}
