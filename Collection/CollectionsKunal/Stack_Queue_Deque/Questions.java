package Collection.CollectionsKunal.Stack_Queue_Deque;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Questions {



    //Implementing queue as stacks using only two stacks
    //pop each element from first stack and push them to second stack
    //now operations on second stack work as queue

    //Add Efficient;
    static class MyQueue{
      private  Stack<Integer> first = new Stack();
        Stack<Integer> second = new Stack();


        public void push(int n){
            first.push(n);
        }

        public  int pop() throws Exception
        {
            while(!first.empty()) {
                second.push(first.pop());
            }
            int removed = second.pop();
            while(!second.empty()){
               first.push(second.pop());
            }
            return removed;
        }

        public int peek() throws Exception{
            while(!first.empty()) {
                second.push(first.pop());
            }
            int topElement = second.peek();
            while(!second.empty()){
                first.push(second.pop());
            }
            return topElement;
        }

       public  boolean isEmpty(){
           return first.isEmpty();
       }


    }



  //  https://www.hackerrank.com/challenges/game-of-two-stacks/problem'/  
     static class TwoStacks{

        static int twoStackGame(int x, int[] a,int[] b){
            return  twoStackGame(x,a,b,0,0)-1;
        }
        static int twoStackGame(int limit, int[] a,int[] b,int sum, int count){

            if(sum>limit){
                return count;
            }

            if(a.length==0|| b.length==0){
                return  count;
            }

            int ans1 = twoStackGame(limit, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);

            int ans2 = twoStackGame(limit,a, Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);
            return  Math.max(ans1,ans2);

        }
    }


    //leetcode 84
    //Histogram
    static int largeRectangleArea(int[] heights){
     Stack<Integer> stack = new Stack<>();
     int max = 0;
     stack.push(0);
     for(int i=1;i<heights.length;i++){
         while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
             max = getMax(heights,stack,max,i);
         }
         stack.push(i);
     }

     int i = heights.length;
     while(!stack.isEmpty()){
         max = getMax(heights,stack,max,i);
     }
     return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stack, int max, int i) {

        int area;

        int popped = stack.pop();
        if(stack.isEmpty()){
            area = arr[popped]*i;
        }
        else{
            area = arr[popped]*(i-1- stack.peek());
        }


        return Math.max(area,max);
    }


    static boolean validParanthesis(String str){

        Stack<Character> stack = new Stack<>();

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)=='['){
                stack.push(']');
            }
           else if(str.charAt(i)=='{'){
                stack.push('}');
            }
            else if(str.charAt(i)=='('){
                stack.push(')');
            }
            else if (stack.isEmpty() || stack.pop() != str.charAt(i)){
                return false;
            }
        }
        return stack.isEmpty();
    }

    static int MakeValidParanthesis(String str){

        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch==')'){
                if(!stack.isEmpty() &&  stack.peek()=='('){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
            else{
                stack.push(ch);
            }
        }

        return stack.size();
    }


    public static void main(String[] args) throws Exception{

        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);

     //   System.out.println(q.peek());
     //   System.out.println(q.pop());


        int[] first = {4,2,4,6,1};
        int[] second = {2,1,8,5};

      //  System.out.println(TwoStacks.twoStackGame(10,first,second));
       // System.out.println(validParanthesis("()"));

        int[] hist = {2,1,5,6,2,3};

        System.out.println(largeRectangleArea(hist));



    }
}
