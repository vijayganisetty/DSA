package Collection.CollectionsKunal.Stack_Queue_Deque;

public class DynamicDeque extends CustomDeque{

    public DynamicDeque(){
        super();
    }
    public DynamicDeque(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) throws Exception {
      if(isFull()){
          int[] temp = new int[data.length*2];

          for(int i=0;i<data.length;i++){
              temp[i] = data[(front+i)%data.length];

          }

          front=0;
          end = data.length;
          data = temp;
      }
      return super.insert(item);
    }
}
