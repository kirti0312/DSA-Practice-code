/*import java.util.*;
public class func{
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static int bincoff(int n,int r){
        int factn=fact(n);
        int factr=fact(r);
        int factnmr=fact(n-r);
        int coeff=factn/(factr*factnmr);
        return coeff;

    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        //int S=fact(n);
        //System.out.println(fact(n));
        //System.out.println(bincoff(n,r));
        System.out.println(sum(3,4));
        System.out.println(sum(1.3f,1.5f));

    }
}*/
/*public class func{
    public static boolean isPrime(int n){
       // boolean isPrime=true;
        if(n==2){
            //isPrime=true;
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                //isPrime=false;
                //break;
                return false;
            }
        }
    //return isPrime;
    return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        Printrange(20);
        
        }
   public static void Printrange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }}*/
  /* public class func{
    public static void BinerytoDecimal(int Binnum){
        int pow=0;
        int dec=0;
        while(Binnum>0){
            int ld=Binnum%10;
            dec=dec+(ld*(int)Math.pow(2,pow)); //here math.pow is typecast to int bcoz pow take double type variable inside it
            Binnum=Binnum/10;
            pow++;
        }
        System.out.println(dec);
    }
    public static void main(String[]args){
        BinerytoDecimal(1001);
    }   }*/

   /* public class func {
        public static void decimelToBinary(int n){
            int pow=0;
            int bin=0;
            while(n>0){
                int rim=n%2;
                bin=bin+(rim*(int)Math.pow(10,pow));
                pow++;
                n=n/2;
            }
            System.out.println(bin);
        }
        public static void main(String[] args) {
            decimelToBinary(12);
        }}*/
    

public class func{
    public static void rectangle(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[]args){
        rectangle(4,5);
    }
}