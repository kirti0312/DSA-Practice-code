import java.util.*;
public class Recursion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      // decreasing(n); 
       //increasing(n);
     //  System.out.println(fact(n));
    //  
    System.out.println(tilingways(3));
    }
    public static void decreasing(int n){
        if(n==1){
            System.out.println(n);
        return;
    }
      System.out.println(n);
      decreasing(n-1);

    }   
    public static void increasing(int n){
        if(n==1){
            System.out.println(n);
            return;
    }
      increasing(n-1);
      System.out.println(n);
    }     
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1); 
    }
    public static boolean issorted(int a[],int i){
        if(i==a.length-1){
            return true;
        }
       if(a[i]>a[i+1]){
        return false;
       }
       return issorted(a,i+1);
    }
    public static int findkey(int a[],int key,int i){
        if(i==a.length){
            return -1;
        }   
         if(a[i]==key){
            return i;
        }
        return findkey(a,key,i++);
        }
    public static int xpowern(int num,int pow){
        if(pow==0){
            return 1;
        }
        return num*xpowern(num,pow--);
    }
    public static int optimized(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimized(x,n/2);
        int halfpowersq=halfpower*halfpower;
        if(n%2!=0){
            halfpowersq= x*halfpowersq;
        }
        return halfpowersq;
    }
    //tiling problem
    public static int tilingways(int n){
        if(n==0||n==1){
            return 1;
        }
        return tilingways(n-1)+tilingways(n-2);
    }
        }
