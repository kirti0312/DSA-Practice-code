import java.util.*;
public class strings{
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static float shortestPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
          // if(str.charAt(i)=="N")// this is wrong bcoz there is comparision bet string type and char type Bcoz double quotes are for string and single for charector
           char d=str.charAt(i);
           if(d == 'N'){
            y++;
           }
           else if(d=='S'){
            y--;
           }
           else if(d=='E'){
             x++;
           }
           else{
            x--;
           }
        }
        return (float)Math.sqrt((x*x)+(y*y));
    }
    public static boolean Equal(String str1,String str2){
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }
    public static String substring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static String LargestString(String fruit[]){
        String largest=fruit[0];
        for(int i=1;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){   //laxicographic comparision
                largest=fruit[i];
            }
        }
        return largest;
    }
    public static String ConvertToUppercase(String str){
    
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&&i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String Compression(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static int countLowercase(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static boolean anagrams(String str1,String str2){
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();
        int count[]=new int[26];
        if(str1.length()!=str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)-'a']++;
            count[str2.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
       String name2=sc.nextLine();
       // System.out.println(name); //but this will not print the space
       // System.out.println(name2);
      // String name="kirti tiwari";
       //System.out.println(name.length());
       //System.out.println(name.charAt(1));
       //printletters(name);
     /*  palindrome(name2);
       if(true){
        System.out.print("palindrome");
       }
       else{
        System.out.print("not palindrome");
       }*/
      //System.out.println(shortestPath(name2));
      //String s1=new String("tom");
     // String s2="hello world";
      //System.out.print(substring(s2,3,8));
      //System.out.print(s2.substring(0,6)); //inbuilt in java
     // String fruits[]={"apple","mango","banana"};
     // System.out.println(LargestString(fruits));
     // System.out.println (ConvertToUppercase(name2));
      //System.out.println(Compression(name2));
      //System.out.println(countLowercase(name2));
      System.out.println(anagrams(name1, name2));

    }
}
//note -- equals -matches the content  and == --matches the refrence {strings have same rference if they are created by litrals ex--String name ="kirti";(this is litral creation , they store in string constrant pool(small part of pool))}
//CompareTo --checks the laxographic comparision {output -ve,0,+ve}