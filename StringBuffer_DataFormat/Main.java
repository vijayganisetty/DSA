package StringBuffer_DataFormat;

import java.text.DecimalFormat;

public class Main {


    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("this is initiated");
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Value");

        StringBuffer sb2 = new StringBuffer(40);

        sb.append(" added a value");

        System.out.println(sb);

        String randomString =  RandomStrings.generate(10);

        System.out.println(randomString);

        //remove spaces
        String  sentence = "this is space    contained  lines ";
        System.out.println(sentence.replaceAll("\\s",""));


        //DecimalFormat

        DecimalFormat df = new DecimalFormat("0");
        System.out.println(df.format(4.67));
    }
}
