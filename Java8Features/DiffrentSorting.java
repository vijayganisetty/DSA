package Java8Features;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.*;
import java.util.stream.Collectors;

public class DiffrentSorting {

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


        List<String> names = List.of("three","four","one","two","five","six");

        names.stream()
                .sorted((f1,f2) -> Integer.compare(f2.length(),f1.length()))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        int[] nums = {1,2,3,4,5,};
        int l =0;
        int r = nums.length-1;
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        for(int x : nums){
            System.out.println(x);
        }


        List<Integer> numbers = Arrays.asList(10,33,15,null,8);

            numbers
                    .stream()
                    .filter(Objects::nonNull)
                    .filter( x -> x.toString().startsWith("1"))
                    .forEach(System.out::println);
    }
}


