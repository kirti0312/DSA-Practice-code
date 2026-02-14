public class array{
   /* public static int linearSearch(String a[],String key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;  //-infinity
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static int smallest(int a[]){
        int smallest= Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                smallest=a[i];
            }
        }
        return smallest;
    }*/
    /*public static void main(String[]args){
       // int marks[]=new int[50];
        int numbers[]={2,4,6,8,10};
        String menu[]={"chai","coffee","pasta"};
        Scanner sc=new Scanner(System.in);
       // marks[0]=sc.nextInt();
        //marks[1]=sc.nextInt();
        //marks[2]=sc.nextInt();
        //marks[2]=marks[2]+1;
        //System.out.println(marks[2]);
        //System.out.println(marks.length);
       /* for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();
        }*/
       //update(numbers);                  //array is passed by reference.
       /* for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }*/
      /* int index= linearSearch(menu,"chai");
      if(index==-1){
        System.out.println("not found");
      }
      else{
        System.out.println(index);
      }
    }
    public static void update(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }*/
       //System.out.println(largest(numbers));
       //System.out.println(smallest(numbers));
    //}
   /* public static int BinerySearch(int arr[],int key){
        int start=0,end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int mid=(start+end)/2;
            if(arr[mid]==key){   //found
                return mid;
            }
            if(arr[mid]<key){    //right
                start=mid+1;
            }
            else{                //left
                end=mid-1;
            }
        }
        return -1;
    }*/
    public static void reverse(int a[]){
        int first=0,last=a.length-1;
        while(first<last){
            int temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;
            last--;
        }
    }
    /*public static void pairs(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;i<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+") ");
            }
            System.out.println();
        }

    }*/
    public static void main(String[] args) {
        int num[]={10,20,30};
        //System.out.println(BinerySearch(num, 20));
          //System.out.println(BinerySearch(num, 80));
          
          reverse(num);
          for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
          }
        // pairs(num);

    }}

