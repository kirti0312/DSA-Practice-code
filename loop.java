/*import java.util.*;
public class loop{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        
        System.out.print(sum+" ");}
    }
}*/
import java.util.*;
public class loop{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        for(int line=1;line<=4;line=line+3){
            if(line==2||line==3){
                continue;
            }
            System.out.println("* * * *");
        }
    }
}
