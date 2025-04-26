package Collection.CollectionsKunal.Tree;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private  static class Node{
        int value ;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private  Node root;

    //insert element
    public  void populate(Scanner sc){
        System.out.println("Enter the root Node : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of "+node.value+" true or false");
        boolean left = sc.nextBoolean();
        if(left){
            System.out.println("enter the value of left of "+node.value);
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter right of "+node.value +" true or false");
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("enter the value of right of "+node.value);
            int val = sc.nextInt();
            node.right= new Node(val);
            populate(sc,node.right);
        }
    }

    public  void display(){
        display(root," ");


    }
    private void display(Node node, String indent){

        if(node==null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");

    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node node,int level){
       if(node==null){
           return;
       }

       prettyDisplay(node.right,level+1);

       if(level!=0){
           for(int i=0;i<level-1;i++){
               System.out.print("|\t\t");
           }
           System.out.println("|-------->"+node.value);
       }
       else{
           System.out.println(node.value);
       }

       prettyDisplay(node.left,level+1);

    }


}
