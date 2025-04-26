package StringBuffer_DataFormat;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeIntegers {


    public static void main(String[] args) {

        BigInteger A = BigInteger.valueOf(9899886);

        BigInteger B = new BigInteger("9872692358725785");

        BigInteger c = A.add(B);
        // System.out.println(c);

        System.out.println(Factorial.fact(100));

        System.out.println(0.4 - 0.3);

        BigDecimal bnum1 = new BigDecimal("0.3");
        BigDecimal bnum2 = new BigDecimal("0.4");
        BigDecimal bnum3 = new BigDecimal("0.409459038593852324");


        System.out.println(bnum2.subtract(bnum1));
        System.out.println(bnum3.pow(3));


    }





}
