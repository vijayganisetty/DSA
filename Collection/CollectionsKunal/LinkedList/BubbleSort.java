package Collection.CollectionsKunal.LinkedList;

public class BubbleSort {

    public void bubbleSort(int row , int col){
        if(row ==0){
            return ;
        }

        if(col<row){
            DoubleLL.Node first = DoubleLL.find(col) ;
            DoubleLL.Node second = DoubleLL.find(col+1);

            if(first.val> second.val){
             //   if(first == head){
                if(first==null){ //dummy
                //   head =  second;
                   first.nxt = second.nxt;
                   second.nxt = first;
                }
               // else if(second == tail){
                else if(second == null){
                    DoubleLL.Node  prev= DoubleLL.find(col-1);
                    prev.nxt = second;
                //    tail =  first;
                    first.nxt = null;
                  //  second.nxt = tail;
                }
                else{
                    DoubleLL.Node  prev= DoubleLL.find(col-1);
                   prev.nxt = second;
                   first.nxt = second.nxt;
                   second.nxt = first;
                }
            }
        }
    }

}

