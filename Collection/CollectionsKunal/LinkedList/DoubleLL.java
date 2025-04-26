package Collection.CollectionsKunal.LinkedList;

public class DoubleLL {

    private static Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.nxt = head;
        node.pre = null;
        if (head != null) {
            head.pre = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node temp = head;
        node.nxt=null;
        if(head==null){
            node.pre=null;
            head=node;
        }
        while(temp.nxt!=null){
            temp = temp.nxt;
        }
        temp.nxt=node;
        node.pre=temp;

    }

    public static Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.val==val){
                return node;
            }
            node = node.nxt;
        }
        return null;
    }
    public void insertAfter(int num,int val){
        Node node = new Node(val);
        Node p = find(num);
        if(p==null){
            System.out.println("node does not exists");
            return;
        }
        node.nxt= p.nxt;
        p.nxt=node;
        node.pre=p;
        if(node.nxt!=null){
            node.nxt.pre=node;
        }


    }

    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + "-->");
            last = node;
            node = node.nxt;
        }
        System.out.print("END");

        System.out.println();
        while (last != null) {
            System.out.print(last.val + "-->");
            last = last.pre;
        }
        System.out.print("START");
    }

    void displayrev(){
        Node node = head;
        Node temp = null;

        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp= temp.pre;
        }
        System.out.println("Start");
    }

    public int deleteFirst(){
        if(head==null){
            return 0;
        }
        int val = head.val;
        head=head.nxt;
        head.nxt.pre=null;
        return val;
    }


    class Node{
        Node pre;
        int val;
        Node nxt;

           public Node(int val) {
               this.val = val;
           }

        public Node() {
        }

        public Node(Node pre, int val, Node nxt) {
               this.pre = pre;
               this.val = val;
               this.nxt = nxt;
           }
       }
}


