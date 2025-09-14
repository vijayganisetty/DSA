package Java8Features.funtionalInterface.methodReference;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExampleOne {

    static Function<String, String> fun = String :: toUpperCase;

   //lambda expression
   static Predicate<Person> p1 = per -> per.getHeight()>140;

    //Method reference
    static Predicate<Person> p2 = MethodReferenceExampleOne::heightCheck;

    static BiPredicate<Person, Integer> p3 =MethodReferenceExampleOne::heightCheckParam;

    static boolean heightCheck(Person person){
        return person.getHeight()>=140;
    }

    static boolean heightCheckParam(Person person, Integer height){
        return person.getHeight() >= height;
    }

    public static void main(String[] args) {
        System.out.println(fun.apply("java"));
        System.out.println(p1.test(PersonRepository.getPerson()));
        System.out.println(p2.test(PersonRepository.getPerson()));
        System.out.println(p3.test(PersonRepository.getPerson(),140));
    }
}
