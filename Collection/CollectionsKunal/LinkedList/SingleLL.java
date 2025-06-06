package Collection.CollectionsKunal.LinkedList;

public class SingleLL {

     Node head;
     Node tail;

    private int size;

    public SingleLL(){
        this.size=0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head=node;

        if(tail == null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val, int index) throws Exception {
        if (index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        if(index>size|| index<0){
            throw new Exception("invalid index");
        }
        Node temp = head;

        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node= new Node(val,temp.next);
        temp.next=node;
        size++;

    }

    //Insertion using recursion
    public void insertRec(int val , int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val , int index, Node node){
        if(index ==0 ){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
       node.next = insertRec(val,index-1,node.next);
        return node;
    }


    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }


    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node= node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next=null;
        return val;
    }

    public int deleteIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next=prev.next.next;
        return val;
    }


     public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.value==val){
                return node;
            }
            node = node.next;
        }
        return null;
     }



    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    public void removeDuplicates(){
        Node temp = head;
        while(temp.next!=null){
            if(temp.value ==temp.next.value) {
                temp.next = temp.next.next;
                size--;
            }
                else{
                   temp= temp.next;
                }
        }
        tail = temp;
        temp.next=null;
    }

        class Node{
        int value;
         Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}