public class QueueB{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr=new int[n];
             size=n;
             rear=-1;
             front=-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static boolean isEmpty2(){
            return front==-1 && rear==-1;
        }
        public static void enqueue(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
        }
        public static void addcircular(int data){
            if(isFull()){
                return;
            }
            if(front==-1){
                front =0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int removeCircular(){
            if(isEmpty2()){
                return -1;
            }
            int val=arr[front];
            
            //last element
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return val;
        }

        public static int dequeue(){
            if(isEmpty()){
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            } 
            return arr[0];
        }
        public static int peek2(){
            if(isEmpty2()){
                return -1;
            }
            return arr[front];
               
           }
    }
    public static void main(String[]args){
        Queue q=new Queue(5);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.dequeue();
        }

        
    }
}