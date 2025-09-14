package Java8Features.streamAPI.parallel;

import Java8Features.repo.PersonRepository;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeqparlExp {

    static int sumMethodUsingSeq(){
        return IntStream.rangeClosed(1,1000000).sum();
    }

    static int sumMethodUsingPar(){
        return IntStream.rangeClosed(1,1000000).parallel().sum();
    }
    
    static long checkPerormance(Supplier<Integer> sum , int numOfTime){
        long start = System.currentTimeMillis();
        for(int i=0;i<=numOfTime;i++){
            sum.get();
        }
        long end = System.currentTimeMillis();
        return end-start;
    }

    static  void getHobbiesSeq(){

        long start = System.currentTimeMillis();
        List<String>  hobbies =  PersonRepository
                .getAllPersons()
                .stream()
                .map( x -> x.getHobbies())
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        long end = System.currentTimeMillis();
        hobbies.stream().forEach(System.out:: println);
        System.out.println("Time taken for seq " + (end-start));
    }

    static void getHobbiesPar(){

        long start = System.currentTimeMillis();
        List<String>  hobbies =  PersonRepository
                .getAllPersons()
                .parallelStream()
                .map( x -> x.getHobbies())
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());

        long end = System.currentTimeMillis();
        hobbies.stream().forEach(System.out:: println);
        System.out.println("Time taken for par " + (end-start));
    }

    static  int seqCalculation(List<Integer> list){
         long start = System.currentTimeMillis();
         int total =  list.stream()
                 .reduce(0,(x,y) -> x+y);
        long end = System.currentTimeMillis();
        System.out.println("Time taken for seq " + (end-start));
        return total;
    }

    static int parCalculation(List<Integer> list){
        long start = System.currentTimeMillis();
        int total =  list.parallelStream()
                .reduce(0,(x,y) -> x+y);
        long end = System.currentTimeMillis();
        System.out.println("Time taken for par " + (end-start));
        return total;
    }

    public static void main(String[] args) {

//        System.out.println("Sequential exp "+ checkPerormance(SeqparlExp::sumMethodUsingSeq,20));
//        System.out.println("Paralle exp " +checkPerormance(SeqparlExp::sumMethodUsingPar,20));
//            getHobbiesSeq();
//            getHobbiesPar();

      List<Integer> list = IntStream.rangeClosed(1,10000).boxed().collect(Collectors.toList());

        System.out.println(seqCalculation(list));

        System.out.println(parCalculation(list));

        Calculation cal = new Calculation();

        IntStream.rangeClosed(1,2000)
                .forEach(cal:: calculate);
        System.out.println(cal.getTotal());

        Calculation cal1 = new Calculation();


        IntStream.rangeClosed(1,2000)
                .parallel()
                .forEach(cal1:: calculate);
        System.out.println(cal1.getTotal());

        Calculation cal2 = new Calculation();
        for(int i=1;i<=2000;i++){
            cal2.calculate(i);
        }
        System.out.println(cal2.getTotal());
    }


}

class  Calculation{

    private  int total;


    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public void calculate(int in){
        total+=in;
    }

}
