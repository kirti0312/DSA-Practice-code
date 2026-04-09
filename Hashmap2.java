import java.util.*;
public class Hashmap2{
    public static boolean 
    public static void main(String[]args){
    HashMap<Integer,Integer> hm=new HashMap<>();
       int[] nums={1,3,2,5,1,3,1,5,1};
       for(int i=0;i<nums.length;i++){
        // if(!hm.containsKey(nums[i])){
        //     hm.put(nums[i],1);
        // }else{
        //     hm.put(nums[i],hm.get(nums[i])+1);
        // }
        // //or
        // hm.put(nums[i],hm.containsKey(nums[i])?hm.get(nums[i])+1:1);
        // //or---best way
        hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);

       }
      // Set<Integer> keys=hm.keySet();  // no need to store 
       for(int k:hm.keySet()){
        if(hm.get(k)>(nums.length/3)){
            System.out.println(k);
        }
       }
    }
}