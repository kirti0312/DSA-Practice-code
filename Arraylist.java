import java.util.ArrayList;
public class Arraylist{
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }
    public static void main(String[]args){
        // //java collection framework
        // //classname objectname = new classname()
        // ArrayList<Integer> list1=new ArrayList<>();
        // ArrayList<String> list2=new ArrayList<>();
        // ArrayList<Boolean> list3=new ArrayList<>();
        // list1.add(1);
        // list1.add(2);
        // System.out.println(list1);
        // System.out.println(list1.get(1));
        // //delete an element
        // list1.remove(1);
        // list1.set(0,10);
        // System.out.println(list1);
        // System.out.println(list1.contains(1));
        // //one moreb add
        // list1.add(1,7);   //O(n)
        // //iteration in arraylist
        // for(int i=0;i<list1.size();i++){
        //     System.out.print(list1.get(i)+" ");
        // }
        // for(int i=list1.size()-1;i>=0;i--){
        //     System.out.print(list1.get(i)+" ");
        // }
        // System.out.println();
        // ArrayList<Integer> list4=new ArrayList<>();
        // list4.add(3);
        // list4.add(1);
        // list4.add(4);
        // list4.add(2);
        // list4.add(1);
        // //find max
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<list4.size();i++){
        //     // if(max<list4.get(i)){
        //     //     max=list4.get(i);
        //     // }
        //     max=Math.max(list4.get(i),max);
        // }
        // System.out.println(max+" largest");
        // System.out.println(list4);
        // swap(list4,1,3);
        // System.out.println(list4);
        // Collections.sort(list4);
        // Collections.sort(list4,Collections.reverseOrder());
        //2d al
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(3);list1.add(4);list1.add(5);
        mainlist.add(list1);
         ArrayList<Integer> list2=new ArrayList<>();
         list2.add(1);list2.add(2);list2.add(4);
         mainlist.add(list2);
         //treversing the 2d al
          for(int i=0;i<mainlist.size();i++){
             ArrayList<Integer> currlist=mainlist.get(i); //list stored at ith idex
             for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
         }
            System.out.println();
         }
         System.out.println(mainlist);
    }
}
