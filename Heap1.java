import java.util.ArrayList;
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
    }}
