package GarbageCollection;

public class ManualGarbageCollection {


    @Override
    public void finalize(){
        System.out.println("finilize is called");
    }

    public static void main(String[] args) {

        // unused objects
        //un referenced objects


        ManualGarbageCollection obj = new ManualGarbageCollection();
        obj= null;


        ManualGarbageCollection obj2 = new ManualGarbageCollection();
        ManualGarbageCollection obj3 = new ManualGarbageCollection();

        obj2=obj3;

        // anonymous
        new ManualGarbageCollection();

        System.gc();

        Runtime.getRuntime() .gc();

    }
}
