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
                capacity=0;
                break;
            }
        }
        return v;
    }
    public static int minAbsoluteDiff(int a[],int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>b[i]){
                sum+=(a[i]-b[i]);
            }else{
                sum+=(b[i]-a[i]);
            }
        }
        return sum;
    }
    public static int maxLengthChainPair(int pairs[][]){
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainLength=1;
        int pairEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>pairEnd){
                chainLength++;
                pairEnd=pairs[i][1];
            }
        }
        return chainLength;
    }
    public static int minCoin(  Integer coins[],int amount){
        Arrays.sort(coins,Collections.reverseOrder());   //note-cxant be called for this primitive datatype (collectrions)
        int count=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
               while(coins[i]<=amount){
                count++;
                amount-=coins[i];
                a.add(coins[i]);
            }}
        }
        System.out.println(a);
        return count;
    }
    static class Job{
        int deadline;
        int profit;
        int id;
        Job(int i,int d,int p){
            deadline=d;
            profit=p;
            id=i;
        }
    }
    public static int chocola(Integer costVert[],Integer costHor[],int n,int m){
        Arrays.sort(costVert,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1;  //vertical and horizontal pieces count
        int cost=0;
        while(h<costHor.length&&v<costVert.length){
            if(costVert[v]<costHor[h]){
                cost+=(costHor[h]*vp);
                hp++;
                h++;
            }else{
                cost+=(costVert[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
             cost+=(costHor[h]*vp);
                hp++;
                h++;
        }
        while(v<costVert.length){
            cost+=(costVert[v]*hp);
                vp++;
                v++;
        }
        return cost;
    }

    public static void main(String[]args){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        System.out.println(ActivitySelection(start, end));
        int value[]={60,100,120};
        int weight[]={10,20,30};
        System.out.println(knapsack(value,weight,50));
        int a[]={4,1,8,7};
        int b[]={2,3,6,5};
       System.out.println(minAbsoluteDiff(a, b));
       int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
       System.out.println(maxLengthChainPair(pairs));
       Integer coins[]={1,5,10,20,50,100,500,2000};
       System.out.println(minCoin(coins,590));
       int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};

       ArrayList<Job> jobs=new ArrayList<>();
       for(int i=0;i<jobsInfo.length;i++){
        jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
       }
       Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
       ArrayList<Integer> seq=new ArrayList<>();
       int time=0;
       for(int i=0;i<jobs.size()-1;i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
       }
       System.out.println("max jobs="+seq.size());
       for(int i=0;i<seq.size();i++){
        System.out.print(seq.get(i)+" ");
       }
       Integer ver[]={2,1,3,1,4};
       Integer hor[]={4,1,2};
       int n=4;
       int m=6;
       System.out.println(chocola(ver, hor, n, m));

    }
}