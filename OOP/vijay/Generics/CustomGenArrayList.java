package OOP.vijay.Generics;

import java.util.Arrays;
import java.util.List;

public class CustomGenArrayList<T extends  Number>  {
    private  Object[] data;
    private static int DEFAULT_SIZE= 10;
    private  int size=0;

    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    private void  resize() {
        Object[] temp = new Object[data.length*2];

        for(int i=0;i<data.length;i++){
            temp[i]= (T)(data[i]);
        }
        data = temp;
    }

    public  void  getList(List<? extends  Number> List){

    }


    private  boolean isFull(){
        return size ==  data.length;
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    public T remove(){
        return (T) data[--size];
    }
    public T get(int index){
        return (T) data[index];
    }
    public int size(){
        return size;
    }

    public  void set(int index , T value){
        data[index]= value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{ "+
                "data=" + Arrays.toString(data) +
                ",size" + size +'}';
    }

    public static void main(String[] args) {
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
//        CustomGenArrayList< >  list1 = new CustomGenArrayList<>();
        for(int i=0;i<14;i++){
            list.add(i*2);
        }

        System.out.println(list);

    }
}
