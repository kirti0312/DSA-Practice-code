import java.util.*;
public class array2{
   /* public static void PrintSubarray(int a[]){
        int total=0;
        int sum =0;
        int MINSUM=Integer.MAX_VALUE;
        int MAXSUM=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+" ");
                    sum = sum + a[k];
                    if(sum<MINSUM){
                        MINSUM=sum;
                    }
                    if(sum>MAXSUM){
                        MAXSUM=sum;
                    }

                }
                System.out.print("sum is "+sum);
                sum =0;
                total++;
                System.out.println();
            }
            System.out.println();
            System.out.println(MINSUM+"is minimum sum ");
            System.out.println(MAXSUM + "is maximum sum");
        }
    }*/
   /* public static void PrefixSUbarraySum(int a[]){
        int prefix[]=new int[a.length];
        prefix[0]=a[0];
        int maxsum=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            prefix[i]=prefix[i-1]+a[i];}
        for(int i=0;i<a.length;i++){      // i is for start
            for(int j=i ;j<prefix.length;j++){     // j is for end
               int sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(sum>maxsum){
                    maxsum=sum;
                }

            }
        }
        System.out.println(maxsum);
    }*/
    public static void kadanes(int a[]){
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<a.length;i++){
            currentsum=currentsum+a[i];
            if(currentsum<0){
                currentsum=0;
            }
          /*  else{
                if(currentsum>maxsum){
                    maxsum=currentsum;
                }
            }*/
           maxsum=Math.max(currentsum,maxsum);     //direct function to find max no.
        }
        System.out.println(currentsum);

    }
    public static int Traprainwater(int height[]){
        int leftMax[]= new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;

    }
    public static void main(String[] args) {
        //int a[]={1,2,3,4,5};
       // PrintSubarray(a);
       //PrefixSUbarraySum(a);
       //kadanes(a);
       Scanner sc=new Scanner(System.in);
       System.out.println("enter size");
       int n=sc.nextInt();
       int height[]=new int[n];
       for (int idx = 0; idx < height.length; idx++) {
           height[idx]=sc.nextInt(); 
       }
       System.out.println(Traprainwater(height));
       }

    }
