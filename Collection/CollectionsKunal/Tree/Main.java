package Collection.CollectionsKunal.Tree;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      //  Scanner sc = new Scanner(System.in);
      //  BinaryTree tree = new BinaryTree();

        //tree.populate(sc);
        // tree.display();
        //  tree.prettyDisplay();

//        BinarySearchTree Stree = new BinarySearchTree();
//        int[] nums={132,2,30,4,15};
//        Stree.populate(nums);
//        Stree.populateSorted(nums);
//        Stree.display();
//        Stree.preOrder();
//        System.out.println();
//        Stree.inOrder();
//        System.out.println();
//        Stree.postOrder();


//        AVLTree avlTree =  new AVLTree();
//
//       for(int i=0;i<=1000;i++){
//           avlTree.insert(i);
//       }
//        System.out.println(avlTree.height());

        int[] arr = {3,8,7,6,-2,-8,4,9};
        SegmentTree tree= new SegmentTree(arr);
       // tree.display();
        System.out.println(tree.query(3,5 ));

    }
}
