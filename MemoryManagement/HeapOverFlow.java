package MemoryManagement;

public class HeapOverFlow {

    void find(){
        System.out.println("found");
    }
    public static void main(String[] args) {

         new HeapOverFlow().find();

        int size=10;
     for(int i=0;i<Integer.MAX_VALUE;i++){
         int[] arr =  new int[size];
         size*=2;
         // vm arguments -Xmx1000m
     }

    }

}
