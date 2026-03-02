import java.util.*;
public class Stackb{
    static class Stack1{
        static ArrayList<Integer> list=new ArrayList<>(); 
        public static boolean isempty(){
            return list.size()==0;
        }
        //push operation
    public static void push(int data){
        list.add(data);
    }
    //pop operation
    public static int pop(){
        if(isempty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    //peek
    public static int peek(){
        return list.get(list.size()-1);
    }

    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        } 
    }
    static class Stack2{
        static  Node head=null;
        public static boolean isempty(){
            return head==null;
        }
        public static void push(int data){    //same as addFirst
            Node newnode=new Node(data);
            if(head==null){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop(){   //same as addLast
            if(isempty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        } 
        public static int peek(){
            if(isempty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static String ReverseAString(String str){
       Stack<Character> s=new Stack<>();
       int idx=0;
       while(idx<str.length()){
            s.push(str.charAt(idx)); 
            idx++;
       }   
       StringBuilder result=new StringBuilder("");
       while(!s.isEmpty()){
            result.append(s.pop());
       }
        return result.toString();

        }
        public static void ReverseStack(Stack<Integer> s){
            if(s.isEmpty()){
                return;
            }
            //recursion
            int top=s.pop();
            ReverseStack(s);
            pushAtBottom(s,top);
        }
        public static void Stockspan(int stocks[],int span[]){
            Stack<Integer> s=new Stack<>();
            span[0]=1;
            s.push(0);
            for(int i=1;i<stocks.length;i++){
                int currprice=stocks[i];
                while(!s.isEmpty()&&currprice>=stocks[s.peek()]){
                    s.pop();
                }
                if(s.isEmpty()){
                    span[i]=i+1;
                }else{
                    int prevhigh=s.peek();
                    span[i]=i-prevhigh;
                }
                s.push(i);
            }
        }
        public static int[] NextGreaterElement(int a[]){   //look for logic and tc ....very impp
            Stack<Integer> s=new Stack<>();
            int nextgreater[]=new int[a.length];
            for(int i=a.length-1;i>=0;i--){
                while(!s.isEmpty()&&a[s.peek()]<=a[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    nextgreater[i]=-1;
                }else{
                    nextgreater[i]=a[s.peek()];
                }
                s.push(i);
            }
            return nextgreater;

        }
        public static void main(String[] args) {
            
        
        Stack1 s=new Stack1();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isempty()){
            System.out.println(s.peek());
            s.pop();
        }
        Stack2 s1=new Stack2();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        while(!s1.isempty()){
            System.out.println(s1.peek());
            s1.pop();
        }
        Stack<Integer> s3=new Stack<>();
        s3.push(11);
        s3.push(12);
        s3.push(13);
        //pushAtBottom(s3,34);
        ReverseStack(s3);
        while(!s3.isEmpty()){
            System.out.println(s3.peek());
            s3.pop();
        }
    
        System.out.println(ReverseAString("abc"));
        int stocks[]={100,80,60,70,60,85,100};
        int span[]=new int[stocks.length];
        Stockspan(stocks,span);
        for(int i=0;i<stocks.length;i++){
            System.out.println(span[i]);
        }
        int a[]={6,8,0,1,3};
        int result[]=NextGreaterElement(a);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]+" ");
        }
    }
}