package Java8Features.interfaceUpgraded;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceDefault {

    public static void main(String[] args) {

        List<String>  nameList = PersonRepository.getAllPersons()
                .stream()
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("Before sort ");
        nameList.forEach(System.out::println);

        Collections.sort(nameList);
        System.out.println("after sort ");
        nameList.forEach(System.out::println);

        System.out.println("Natural order");
        nameList.sort(Comparator.naturalOrder());
        nameList.forEach(System.out::println);

        System.out.println("Reverse order");
        nameList.sort(Comparator.reverseOrder());
        nameList.forEach(System.out::println);




    }
}


