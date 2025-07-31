package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//
//  //      arr.forEach(num-> System.out.println(num));
//        arr.forEach(System.out::println);

        String str = "Vijay Ganisetty";
        MyPrinter mp = new MyPrinter();
//        mp.print(str, new Parser() {
//            @Override
//            public String parse(String str) {
//                return  StringParser.convert(str);
//            }
//        });

//      mp.print(str, str1 -> StringParser.convert(str1));

        mp.print(str, StringParser::convert);
  }


}


interface Parser{
    String parse(String str);
}

class StringParser {
    public  static String convert(String s) {
        if (s.length() <= 3) {
            s = s.toUpperCase();
        } else {
            s = s.toLowerCase();
        }
        return s;
    }
}

class MyPrinter{
  public void print(String str,Parser p){
      str = p.parse(str);
      System.out.println(str);
  }
}









