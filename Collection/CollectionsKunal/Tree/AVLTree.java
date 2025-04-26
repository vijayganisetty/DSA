package Collection.CollectionsKunal.Tree;

public class AVLTree {

   public AVLTree(){

   }


    private static class Node {
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value) {
            this.value = value;
        }
    }


    private Node root;

   public int height(){
      return height(root);
   }

    private int height(Node node){
        if(node ==null){
            return -1;
        }
        return node.height;
    }

    boolean isEmpty( Node node){
        return root==null;
    }

    public void display(){

        display(root,"Root Node: ");
    }

    private void display( Node node, String details) {

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

    private  Node insert(int value,  Node node){
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

        node.height = Math.max(height(node.left), height(node.right))+1;

        // return node;
        return  rotate(node);
    }

    private Node rotate(Node node) {

        if(height(node.left)- height(node.right)>1){
           //left heavy
           if(height(node.left.left)- height(node.left.right)>0){
               // left-left heavy - rule 1
               return rightRotate(node);
           }
        if(height(node.left.left)- height(node.left.right)<0){
               //left - right - rule 2
               node.left = leftRotate(node.left);
               return  rightRotate(node);
           }
        }
        if(height(node.left)- height(node.right)<-1) {
            //right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                // right-right  - rule 3
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                //right-left - rule 4
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node c) {

        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;


        c.height = Math.max(height(c.left), height(c.right))+1;
        p.height = Math.max(height(p.left), height(p.right))+1;


        return p;
    }

    private Node rightRotate(Node p) {

        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left= t;

        p.height = Math.max(height(p.left), height(p.right))+1;

        c.height = Math.max(height(c.left), height(c.right))+1;

        return c;
    }

    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced( Node node){
        if(node==null){
            return true;
        }
        return  Math.abs(height(node.left)- height(node.right)) <=1 && balanced(node.right) && balanced(node.right);
    }

    public void populate(int[] nums){
        for (int num : nums) {
            this.insert(num);
        }
    }

}
