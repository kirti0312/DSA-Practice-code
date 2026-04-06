import java.util.*;
public class Hashmap{
    public static void main(String[]args){
    HashMap<String, Integer> hm=new HashMap<>();

    hm.put("India",100);
    hm.put("US",50);
    hm.put("China",150);
    System.out.println(hm);
    int population=hm.get("India");
    System.out.println(population);
    System.out.println(hm.get("Indonessia"));
    //containsKey()
    System.out.println(hm.containsKey("India"));
    //remove(key)
   // System.out.println(hm.remove("China"));
    //size()
    System.out.println(hm.size());
    //isEmpty()
    System.out.println(hm.isEmpty());
    //clear()
   // hm.clear();   //clears everything
    System.out.println(hm.isEmpty());
    //iteration in loop
    Set<String> keys=hm.keySet();
    System.out.println(keys);
    for(String k:keys){
        System.out.println("key="+k+",val="+hm.get(k));
    }
    }
}