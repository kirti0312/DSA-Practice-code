import java.util.*;
public class Queue_p{
    static class StackUsingDeque{
       static  Deque<Integer> deque=new LinkedList<>();
        public static void push(int data){
            deque.addLast(data);
        }
        public static int pop(){
            // int top=deque.getLast();
            // deque.removeLast();
            // return top;
            return deque.removeLast();
        }
        public static int peek(){
            return deque.getLast();
        }
    }
    public static void firstnonrepeating(String str){
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void InterleaveHalves(Queue<Integer> q){
        Queue<Integer> firstHalf=new LinkedList<>();
        int size=q.size();
        for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void QueueReversal(Queue<Integer> q){
        Stack<Integer> s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        firstnonrepeating("aabccxb");
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
       // InterleaveHalves(q);
       QueueReversal(q);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        StackUsingDeque s=new StackUsingDeque();
        s.push(11);
        s.push(12);
        s.push(13);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }}
