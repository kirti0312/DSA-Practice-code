public class QueueB{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            arr=new int[n];
             size=n;
             rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void enqueue(int data){
            if(rear==size-1){
                System.out.println("queue is full");
                return;
            }
            rear=rear+1;
            arr[rear]=data;
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