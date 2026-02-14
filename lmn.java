/*import java.util.*;
public class lmn{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rim;
        while(num>0){
            rim=num%10;
            num=num/10;
            System.out.print(rim);

        }
    }}*/
    import java.util.*;
    public class lmn{
                public static void main(String[]args){
                    Scanner sc=new Scanner(System.in);
                    int n=sc.nextInt();
                    int temp=n;
                    int rev=0;
                    while(n>0){
                        int ld=n%10;
                        rev=(rev*10)+ld;
                        n=n/10;
                    }
                    System.out.println(rev);
        if(temp==rev){
            System.out.println("Palindrome");
        }

        }
    }
   /* import java.util.*;
    public class lmn{
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            boolean isPrime=true;
            if(n==2){
                System.out.println("n is prime");
            }
            else{
                for(int i=2;i<=Math.sqrt(n);i++){
                    if(n%i==0){
                    isPrime=false;
                }
            }
            if(isPrime==true){
                System.out.println("n is prime");
            }
        }}}*/
    


    
