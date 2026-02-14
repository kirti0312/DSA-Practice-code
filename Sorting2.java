public class Sorting2{
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si +(ei-si)/2;
        mergesort(arr,si,mid);  //calling recursively for left part
        mergesort(arr,mid+1,ei); //calling recursively right part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //itrator for left part
        int j=mid+1; //iterater for right part
        int k=0; //itrater for temp array
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //remaining part copy as it is
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy the temp to org array
        for(i=si,k=0;k<temp.length;i++,k++){
            arr[i]=temp[k];
        }

    }
    public static void quickSort(int a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx=partition(a,si,ei);
        quickSort(a,si,pidx-1); //left prt
        quickSort(a,si,pidx+1);//right prt
    }
    public static int partition(int a[],int si,int ei){
        int pivot = a[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(a[j]<=pivot){
                i++;
                //swap
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        i++;
            int temp=pivot;
            a[ei]=a[i];
            a[i]=temp;
            return i;
    }
    public static int sortedRotatedSearch(int a[],int target,int si,int ei){
        int mid=(si+ei)/2;
        if(a[mid]==target){
            return mid;
        }
        //if mid lies on line 1
        if(a[si]<=a[mid]){
            //target is in left of l1
            if(target>=a[si]&&target<=a[mid]){
                return sortedRotatedSearch(a,target,si,mid);
            }
            //target is in right part
            else{
                return sortedRotatedSearch(a,target,mid,ei);
            }
        }
        //if mid lies on line 2
        else{
            //mid is right of l2
            if(target>=a[mid]&&target<=a[ei]){
                return sortedRotatedSearch(a,target,mid,ei);
            }
            //target is in left part
            else{
                return sortedRotatedSearch(a,target,si,mid);
            }
        }
        
    }
    public static void main(String[]args){
        int a[]={4,5,6,7,0,1,2};
       // mergesort(a,0,a.length-1);
       // print(a);
        System.out.println(sortedRotatedSearch(a,0,0,a.length-1));
    }
}

