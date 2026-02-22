import java.util.ArrayList;
public class Arraylist{
    public static void main(String[]args){
        //java collection framework
        //classname objectname = new classname()
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println(list1);
        System.out.println(list1.get(1));
        //delete an element
        list1.remove(1);
        list1.set(0,10);
        System.out.println(list1);
        System.out.println(list1.contains(1));
        //one moreb add
        list1.add(1,7);   //O(n)
        //iteration in arraylist
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        for(int i=list1.size();i>=0;i--){
            System.out.print(list1.get(i)+" ");
        }
        
    }
}
