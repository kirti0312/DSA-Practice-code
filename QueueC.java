import java.util.*;
public class QueueC{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queuell{
         static Node head=null;
         static Node tail=null;
         public static boolean isEmpty(){
            return head==null && tail==null;
         }
         public static void add(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
         }
         public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return front;
         }
         public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data; 
         }
    }
    static class QueueUsingStack{
        static Stack<Integer> s1=new Stack<>();
         static Stack<Integer> s2=new Stack<>();
         public static boolean isEmpty(){
            return s1.isEmpty();
         }
         public static void add2(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

         }
         public static int remove2(){
            if(isEmpty()){
                return -1;
            }
            return s1.pop();
             }
             public static int peek2(){
                 if(isEmpty()){
                return -1;
            }
            return s1.peek();
             }

    }
    static class StackUsingQueue{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();
        public static boolean isEmpty3(){
            return q1.isEmpty() && q2.isEmpty();
        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }
        public static int pop(){
            if(isEmpty3()){
                return -1;
            }
            int top=-1;
            //case1 --if q1 has all the elements
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }else{    //case2--ifq2 has all the elements
                while(!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
            }
        }
        return top;

    }
    public static int peek3(){
        if(isEmpty3()){
                return -1;
            }
            int top=-1;
            //case1 --if q1 has all the elements
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    top = q1.remove();
                    q2.add(top);
                }
            }else{    //case2--ifq2 has all the elements
                while(!q2.isEmpty()){
                    top = q2.remove();
                    q1.add(top);
            }
        }
        return top;
    }}
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();    //queue is interface and implemented by linklist and arraydequeue
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        StackUsingQueue s=new StackUsingQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty3()){
            System.out.println(s.peek3());
            s.pop();
        }
    }}
