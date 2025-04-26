package OOP.vijay.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private  int[] data;
    private static int DEFAULT_SIZE= 10;
    private  int size=0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    private void  resize() {
        int[] temp = new int[data.length*2];

        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data = temp;
    }

    private  boolean isFull(){
        return size ==  data.length;
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    public int remove(){
        return data[--size];
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }

    public  void set(int index , int value){
        data[index]= value;
    }
    @Override
    public String toString(){

        return "CustomArrayList{ "+
                "data=" + Arrays.toString(data) +
                        ",size" + size +'}';
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);
        System.out.println(list);
//        CustomArrayList arr = new CustomArrayList();
//        arr.add(10);
//        arr.size();
//        arr.add(12);
//        arr.set(1,2);
//        System.out.println(arr.get(0));
//        System.out.println(arr.size());
//        System.out.println(arr.toString());
//        System.out.println(arr.remove());

//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.size();
//        list.isEmpty();
    }
}
