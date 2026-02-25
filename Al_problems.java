import java.util.ArrayList;
public class Al_problems{
    public static void main(String[]args){
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
         ArrayList<Integer> list=new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
          ArrayList<Integer> list1=new ArrayList<>();
          list1.add(4);
          list1.add(5);
          list1.add(1);
          list1.add(2);
          list1.add(3);
          
        int volmax=0;
      //brute approach to find container with max water  
      for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                //int max=Math.max(height.get(i),height.get(j));
                int min = Math.min(height.get(i),height.get(j));
                int v=(j-i)*min;
                volmax=Math.max(v,volmax);

            }
      }
        System.out.println(volmax);
        System.out.println(optimizedMAXWater(height));
        PairSum(list,5);
        Pairsum2(list1,5);
    }
    public static int optimizedMAXWater(ArrayList<Integer> list){
        int rp=list.size()-1;
        int lp =0;
        int maxvol=0;
        while(lp<rp){
            int min=Math.min(list.get(lp),list.get(rp));
            int v=(rp-lp)*min;
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
            maxvol=Math.max(maxvol,v);
            
        }
        return maxvol;
    }
    //to find the pair in a sorted arraylist whose sum is equal to the  given target 
public static void PairSum(ArrayList<Integer> list,int target){
    int lp=0;
    int rp=list.size()-1;
    while(lp<rp){
        if(list.get(lp)+list.get(rp)==target){
            System.out.println(lp+","+rp);
            return;
        }
        else if(list.get(lp)+list.get(rp)<target){
            lp++;
        }
        else{
            rp--;
        }
    }
}
    public static void Pairsum2(ArrayList<Integer> list,int target){
        int lp=-1;
        int rp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                rp=i;
                lp=i+1;
                break;
            }
        }
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println(lp+","+rp);
                return;
            }
        else if(list.get(lp)+list.get(rp)<target){
            lp=(lp+1)%list.size();
        }
        else{
            rp=(list.size()+rp-1)%list.size();
        }
        }
    }



}