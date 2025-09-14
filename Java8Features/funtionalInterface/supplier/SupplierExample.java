package Java8Features.funtionalInterface.supplier;

import Java8Features.repo.Person;
import Java8Features.repo.PersonRepository;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<List<Person>> supplier = () -> PersonRepository.getAllPersons();

    static Supplier<Person> sup = () -> PersonRepository.getPerson();

    public static void main(String[] args) {
        System.out.println(supplier.get());
        System.out.println(sup.get());
    }
}
