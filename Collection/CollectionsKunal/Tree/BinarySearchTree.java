package Collection.CollectionsKunal.Tree;

public class BinarySearchTree {


    public BinarySearchTree(){

    }



    public class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }
    }



    private Node root;

    public int heigth(Node node){
        if(node ==null){
            return -1;
        }
        return node.height;
    }

    boolean isEmpty(Node node){
        return root==null;
    }

    public void display(){

        display(root,"Root Node: ");
    }

    private void display(Node node, String details) {

        if(node==null){
            return;
        }
            System.out.println(details+node.value);
            display(node.left,"left child of"+node.value+" : ");
            display(node.right,"Right child of"+node.value+" : ");
        }

        public void insert(int value){
           root= insert(value,root);
        }

        private Node insert(int value,Node node){
        if(node==null){
            node = new Node(value);
            return node;
        }
        if(value<node.value){
            node.left= insert(value,node.left);
        }
       if(value>node.value){
           node.right = insert(value,node.right);
       }

       node.height = Math.max(heigth(node.left),heigth(node.right))+1;

        return node;
       }

       public boolean balanced(){
        return balanced(root);
       }

       private boolean balanced(Node node){
           if(node==null){
               return true;
           }
           return  Math.abs(heigth(node.left)-heigth(node.right)) <=1 && balanced(node.right) && balanced(node.right);
       }

       public void populate(int[] nums){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
       }

       public void populateSorted(int[] nums){

           populateSorted(nums,0,nums.length);
       }


       private void populateSorted(int[] nums,int start,int end){

        if(start>=end){
            return;
        }

        int mid= (start+end)/2;

        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);
       }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.value+"-->");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.value+"-->");
        inOrder(node.right);
    }

    public void postOrder(){
        postOrder(root);
    }

    private void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+"-->");
    }

}

