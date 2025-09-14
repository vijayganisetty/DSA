package FileHandling;

import java.io.*;


public class FileOps {

    public static void main(String[] args) throws IOException {

        //file creating
        File fo = new File("new_file.txt");
       Boolean rs = fo.createNewFile();
       if(rs){
           System.out.println("file created");
       }

        //writing to file
        FileWriter fileWriter = new FileWriter("new_file.txt",true);
        fileWriter.write("hello");
        fileWriter.close();

        //reading from file
        FileReader fileReader = new FileReader("new_file.txt");
        while (fileReader.ready()){
            System.out.println((char) fileReader.read());
        }
        fileReader.close();

//        BufferedReader br = new BufferedReader(new FileReader("new_file.txt"));
//        System.out.println(br.readLine());
//        br.close();


        //deleting
        if(fo.delete()){
            System.out.println(fo.getName()+" is deleted");
        }

    }
}
