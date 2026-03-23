import java.util.*;
public class Greedy{
    public static int ActivitySelection(int start[],int end[]){
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //1st activity
        maxAct=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                ans.add(i);
                maxAct++;
                lastend=end[i];
            }
        }
        System.out.println(ans);
        return maxAct;
    }
    public static int knapsack(int value[],int weight[],int capacity){
        double ratio[][]=new double[value.length][2];
        for(int i=0;i<ratio.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weight[i];
        }
        int v=0;
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                capacity-=weight[idx];
                v+=value[idx];
            }else{
                v+=ratio[i][1]*capacity;
            }
        }
        return v;
    }
    public static void main(String[]args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        System.out.println(ActivitySelection(start, end));
        int value[]={60,100,120};
        int weight[]={10,20,30};
        System.out.println(knapsack(value,weight,50));
    }
}