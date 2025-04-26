package Collection.CollectionsKunal.LinkedList;

public class CircularLL {

  private   Node head;
  private   Node tail;

    public void insertFirst(int val){

        Node node = new Node(val);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.nxt = node;
        node.nxt=head;
        tail = node;
    }

    public void deleteFirst(){
        Node node = head;
         head=head.nxt;
        tail.nxt=head;
    }

    public void delete(int val){
        Node node = head;
        if(node==null){
          return;
        }
        if(node.val==val){
            head=head.nxt;
            tail.nxt=head;
        }

        do{
            Node n = node.nxt;
            if(n.val==val){
                node.nxt=n.nxt;
                break;
            }
            node=node.nxt;
        }
        while(node!=head);
    }

    public void display(){
        Node node = head;
        if(head!=null){
            do {
                System.out.print(node.val + "-->");
                node= node.nxt;
            }
            while(node!=head);
        }
        System.out.println("Head");
    }

    class Node{

        int val;
        Node nxt;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node nxt) {
            this.val = val;
            this.nxt = nxt;
        }

    }
}
