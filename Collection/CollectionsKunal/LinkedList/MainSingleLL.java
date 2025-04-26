package Collection.CollectionsKunal.LinkedList;
public class MainSingleLL {

//    static void sample(String str){
//
//        System.out.println(str+"here");
//    }
//
//    static void sample(String... str){
//
//        System.out.println(Arrays.toString(str));
//    }




    public  static SingleLL mergeList(SingleLL list1 , SingleLL list2){
        SingleLL list = new SingleLL();

        //merge two list
        SingleLL.Node h1 = list1.head;
        SingleLL.Node h2 = list2.head;

        while(h1!=null && h2!=null){
            if(h1.value<h2.value){
                list.insertLast(h1.value);
                h1= h1.next;
            }
            else {
                list.insertLast(h2.value);
                h2 = h2.next;
            }
        }
        while(h1!=null){
            list.insertLast(h1.value);
            h1= h1.next;
        }
        while(h2!=null){
            list.insertLast(h2.value);
            h2= h2.next;
        }
        return  list;
    }

    // Find length of the cycle
//    public int LengthOfCycle(CircularLL list){
//        CircularLL fast = list;
//        CircularLL slow= list;
//        while(fast!=null && fast.nxt!=null){
//            fast = fast.nxt.nxt;
//            slow = slow.nxt;
//
//            if(fast==slow){
//                 int length=0;
//                 list temp = slow;
//                 do{
//                     temp=temp.next;
//                 }
//                 while{
//                     temp!=slow;
//                }
//            }
//        }
//        return 0;
//    }

   static public boolean isHappy(int n) {
        int sum=0;
        if(n<1){
            return false;
        }
        while(n>9){
            if(n==10){
                return true;
            }
            int x=n;
            sum=0;
            while(x>0){
                int a = x%10;
                sum += a*a;
                x=x/10;
            }
            n=sum;
        }
        if(n==1){
            return true;
        }
        return false;
    }

    //recursion reverse

    static void reverseNodeRec(SingleLL node){

    }

    //iteration method
    static void inplaceReverse(SingleLL node){
        SingleLL.Node  prev = null;
        SingleLL.Node present = node.head;
        SingleLL.Node next = node.head.next;

        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;

            if(next!= null){
                next = next.next;
            }
        }
        node.head  = prev;
    }

   static SingleLL partOfListReverse(SingleLL head , int left , int right){

        if(left == right){
            return head;
        }

        //Skip the first left -1;
        SingleLL.Node current = head.head;
        SingleLL.Node  prev = null;
        for(int i=0; current!=null &&i<left-1 ;i++){
            prev = current;
            current = current.next;
        }
        SingleLL.Node last = prev;
        SingleLL.Node newEnd = current;
        SingleLL.Node nxt  = current.next;
        for(int i=0;i<right-left+1 && current!=null;i++){
            current.next = prev;
            prev=current;
            current = nxt;
            if(nxt!=null){
                nxt = nxt.next;
            }
        }
        if(last!=null){
            last.next = prev;
        }
        else{
            head.head = prev;
        }
         newEnd.next = current;
      return  head;
   }

   static boolean isPalindrome(SingleLL head){
        SingleLL.Node mid = middle(head);

        return true;
   }

   static SingleLL.Node middle(SingleLL list){
        SingleLL.Node first = list.head;
        SingleLL.Node second = list.head;

        while(second!=null && second.next!=null){
            first = first.next;
            second = second.next.next;
        }
        return first;
   }
    public static void main(String[] args) {
        SingleLL list1 = new SingleLL();
        SingleLL list2 = new SingleLL();

        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list1.insertLast(4);
        list1.insertLast(5);

        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(9);
        list2.insertLast(14);

      //  System.out.println(middle(list1).value);

      //  inplaceReverse(list1);
      //  list1.display();

        //  partOfListReverse(list1,2,4).display();



      //  System.out.println(isHappy(7));
      //  SingleLL ans =  mergeList(list,list2);
      // ans.display();
      //  list.removeDuplicates();

//        list.insertLast(100);
//        list.insertRec(30,3);
        //  list.display();
//        try {
//            list.insert(24, 3);
//        }
//        catch (Exception a){
//            System.out.println(a);
//        }
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println(list.deleteLast());
//       list.display();
//
//        System.out.println(list.deleteIndex(1));
//        list.display();
//
//        System.out.println(list.find(4));
//

    }
}
