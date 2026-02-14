public class sorting{
    public static void BubbleSort(int a[]){
        int swap =0;
        for(int i=0;i<=a.length-2;i++){
            for(int j=0;j<=a.length-i-2;j++){
              if(a[j]>a[j+1]){  
              int temp = a[j];
              a[j]=a[j+1];
              a[j+1]=temp;
              swap++;
            }
            }
            if(swap==0){
                System.out.println("array sorted");
                break;
            }
            
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void selectionSort(int a[]){
        for(int i =0;i<a.length-1;i++){
            int minindex=i;       //here we store the index i not the element at i bcoz we have to swap the value for that index in required
            for(int j=i+1;j<a.length;j++){
                if(a[minindex]>a[j]){     //here we cant use math.min func directly bcoz it only compares the value doesnt return the index and we also need index
                    minindex=j;
                }
            }
            int temp = a[minindex];
            a[minindex]=a[i];
            a[i]=temp;
            
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void insertionSort(int a[]){
        for(int i=1;i<a.length;i++){
            int curr=a[i];            // here we store the element of ith posn in curr varaible not index
            int prev = i-1;
            while(prev>=0&& a[prev]>curr){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;
        }
    }
    public static void CountingSort(int a[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            largest=Math.max(largest,a[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<largest+1;i++){
            count[a[i]]++;         //by default array has 0 so after count increment it would be increased to 1
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                a[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void Display(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");}
    }
    public static void main(String[]args){
        int a[] = {5,4,1,3,2};
        int b[]={1,4,1,3,2,4,3,7};
       // BubbleSort(a);
       //selectionSort(a);
      // insertionSort(a);
      //Arrays.sort(a,0,3);
      CountingSort(b);
       Display(b);
    }
}