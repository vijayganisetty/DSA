package Collection.CollectionsKunal.Tree;

public class SegmentTree {


    private static class  Node{
        int value;
        Node left;
        Node right;
        int startinterval;
        int endinterval;

        public Node(int startinterval,int endinterval){
            this.startinterval= startinterval;
            this.endinterval = endinterval;
        }

    }

    Node root;


    public SegmentTree(int[] arr){
        //create a tree using this array
        this.root = constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {

        if(start==end){
            //leaf node
            Node leaf = new Node(start,end);
            leaf.value=arr[start];
            return leaf;
        }

        //create new node with index you are at
        Node node = new Node(start,end);

        int mid = (start+end)/2;

        node.left = this.constructTree(arr,start,mid);
        node.right = this.constructTree(arr,mid+1,end);



        //the operation here changes as per our requirement
        //if it is find sum of elements use +
        //if it is find  product of elements use -
        node.value = node.left.value + node.right.value;

        return node;

    }

    public void  display(){
        display(this.root);
    }

    private void display(Node node) {

        String str ="";

        if(node.left!=null){
            str= str + "Interval =[" + node.left.startinterval +"-"+node.left.endinterval+"] and data: "+
                    node.left.value +" ";

        }
        else{
            str = str +"No left child";

        }

        //for current child
        str= str + "Interval =[" + node.startinterval +"-"+node.endinterval+"] and data: "+
                node.value +" ";

        if(node.right != null) {
            str = str + "Interval =[" + node.right.startinterval + "-" + node.right.endinterval + "] and data: " +
                    node.right.value + " ";
        }
        else{
            str = str + "no rigth child";
        }

        System.out.println(str+"\n");

        if(node.left !=null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }

    }

    //query
    //qsi -query start index
    public int query(int qsi,int qei){

         return this.query(this.root,qsi,qei);

    }

    private int query(Node node, int qsi, int qei) {

        if(node.startinterval>=qsi && node.endinterval<=qei){
            //node is completely lying inside the intervals;
            return node.value;
        }
        else if(node.startinterval>qei || node.endinterval<qsi){
            //node is completely outside;
            return 0;
        }
        else{
            //overlaping , half inside
             return this.query(node.left,qsi,qei)+this.query(node.right,qsi,qei);
        }

    }

    //updating the original values
    public int update(int index , int value){
       return update(this.root,index,value);

    }

    private int update(Node node, int index, int value) {
      if(index>=node.startinterval && index<= node.endinterval) {

          if (index == node.startinterval && index == node.endinterval) {
              node.value = value;
              return node.value;
          } else {
              int leftAns = update(node.left, index, value);
              int rightAns = update(node.right, index, value);
              node.value = leftAns + rightAns;
              return node.value;
          }
      }
      return node.value;
    }


}
