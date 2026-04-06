import java.util.ArrayList;
import java.util.PriorityQueue;
public class Heap1{
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){
            //add at last index
            arr.add(data);
            int x=arr.size()-1;   //child index
            int par=(x-1)/2;   //parent index
            while(arr.get(x)<arr.get(par)){
                //swap
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minIdx=i;
            if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
                minIdx=left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
                minIdx=right;
            }
            if(minIdx!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);
                //call again
                heapify(minIdx);

            }
        }
        public int remove(){
            int data=arr.get(0);
            //step1-swap
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //step-2 - delete last
            arr.remove(arr.size()-1);

            //step3 -heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void heapSort(int arr[]){
        //step 1-build maxheap
        int n=arr.length;
        for(int i=n/2;i<=0;i--){
            heapify1(arr,i,n);
        }
        //step 2 -push largest at end  --swap
        for(int i=n-1;i>0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            heapify1(arr,0,i);
        }
    }
    public static void heapify1(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;
        if(left<size && arr[left]>arr[maxIdx]){
            maxIdx=left;
        }
        if(right<size && arr[right]>arr[maxIdx]){
            maxIdx=right;
        }
        if(maxIdx!=i){
            //swap
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;
            heapify1(arr, maxIdx, size);
        }
    }
    static class Point implements Comparable<Point>{
        int x;
        int y;
        int dis;
        int idx;
        public Point(int x,int y,int dis,int idx){
            this.x=x;
            this.y=y;
            this.dis=dis;
            this.idx=idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.dis-p2.dis;  //Ascending order
        }
    }
    static class Weakest implements Comparable<Weakest>{
        int idx;
        int rowSum;
        public Weakest(int idx,int rowSum){
            this.idx=idx;
            this.rowSum=rowSum;
        }
        @Override
        public int compareTo(Weakest w2){
            if(this.rowSum==w2.rowSum){
                return this.idx-w2.idx;
            }else{
            return this.rowSum-w2.rowSum;
        }}
    }
    static class Sliding implements Comparable<Sliding>{
        int idx;
        int val;
        public Sliding(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Sliding s2){
            return s2.val-this.val;  //decending order
        }

    }

    
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
       // System.out.println(h.peek());
       int pts[][]={{3,3},{5,-1},{-2,4}};
       int k=2;
       PriorityQueue<Point> pq=new PriorityQueue<>();
       
       for(int i=0;i<pts.length;i++){
            int dis=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0],pts[i][1],dis,i));
       }
       //for k cars
       for(int i=0;i<k;i++){
        // System.out.print(pq.peek().idx+" ");
        // pq.remove();
        //or we can directly remove and get
        System.out.print("C"+pq.remove().idx+" ");
        }
         int ropes[]={2,3,3,4,6};
        PriorityQueue<Integer> pq1=new PriorityQueue<>();
        for(int i=0;i<ropes.length;i++){
            pq1.add(ropes[i]);
       }
       int cost=0;
       while(pq.size()>1){
        int min=pq1.remove();
        int min2=pq1.remove();
        cost+=min+min2;
        pq1.add(min+min2);
       }
       System.out.println("cost of connecting n ropes="+cost);
       int weak[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
       int n=2;
    //    int arr[]=new int[weak.length];
    //    for(int i=0;i<arr.length;i++){
    //      for(int j=0;j<weak[0].length;j++){
    //         arr[i]+=weak[i][j];              //no need to create array
    //      }
    //    }
       PriorityQueue<Weakest> w=new PriorityQueue<>();
    //    for(int i=0;i<arr.length;i++){
    //     w.add(new Weakest(i,arr[i]));
    //    }
    //    System.out.println(w.remove().idx+" "+w.remove().idx);
        for(int i=0;i<weak.length;i++){
            int count=0;
            for(int j=0;j<weak[0].length;j++){
                count+=weak[i][j]==1?1:0;
            }
            w.add(new Weakest(i,count));
        }
        for(int i=0;i<n;i++){
            System.out.print("R"+w.remove().idx+" ");
        }
        //sliding window problem --maximum of all subarrays of size s
        int arr[]={1,3,-1,-3,5,3,6,7};
        int s=3;
        int res[]=new int[arr.length-s+1];
        PriorityQueue<Sliding> pq3=new PriorityQueue<>();
        //1st window element
        for(int i=0;i<s;i++){
            pq3.add(new Sliding(arr[i],i));
        }
        res[0]=pq3.peek().val;
        for(int i=s;i<arr.length;i++){
            while(pq3.size()>0 && pq3.peek().idx<=i-s){
                pq3.remove();
            }
            pq3.add(new Sliding(arr[i],i));
            res[i-s+1]=pq3.peek().val;
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }




    }}
