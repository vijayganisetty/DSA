package Collection.CollectionsKunal.LinkedList;

import java.util.LinkedList;

public class MergeSort {

   public static ListNode sortList(ListNode head){

       if(head == null || head.next ==null){
           return head;
       }
       ListNode mid = getMid(head);
       ListNode left = sortList(head);
       ListNode right = sortList(mid);

       return  mergeList(left,right);
   }


    public  static ListNode mergeList(ListNode list1 , ListNode list2){
        ListNode dummyHead = new ListNode() ;
        ListNode tail = dummyHead;
        while (list1!= null  && list2!= null)
        {
            if(list1.val<list2.val)
            {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1!=null)?list1:list2;
        return  dummyHead.next;
    }

    public static ListNode getMid(ListNode list){
        ListNode slow = list;
        ListNode fast = list;
       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast= fast.next.next;
       }
       return  slow;
    }

    public static void main(String[] args) {

    }
}
