package MemoryManagement;

public class StackOverFlow {

    public static void main(String[] args)  {
        new StackOverFlow().add(1);
    }

    void add(int i){
        System.out.println(i);
        i++;
        add(i);

        // vm options -Xss2m
    }
}
