package StringBuffer_DataFormat;

import java.util.Random;

public class RandomStrings {

    static  String generate(int size){
        StringBuffer sb = new StringBuffer();

        Random random = new Random();

        for(int i=0;i<size;i++){

            int charnum = 97 +(int) (random.nextFloat()*26);
            sb.append((char)charnum);
        }

        return  sb.toString();
    }
}
