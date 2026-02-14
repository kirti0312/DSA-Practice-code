 class Recprob{
    public static void main(String[] args) {
       // System.out.println(tilingways(4));
      // removedup("aabbcc",0,new StringBuilder(""),new boolean[26]);
      //System.out.println(pairfrnds(3));
      binaryString(3, 0,"");
    }
 
  public static int tilingways(int n){
        if(n==0||n==1){
            return 1;
        }
        return tilingways(n-1)+tilingways(n-2);
    }
    public static void removedup(String s,int i,StringBuilder news,boolean map[]){
        //StringBuilder news=new StringBuilder("");
        //boolean map[]=new boolean[26];
        if(i==s.length()){
            System.out.println(news);
            return;
        }
        char currChar =s.charAt(i);
        if(map[currChar-'a']==true){
            removedup(s,i+1,news,map);
        }
        else{
            map[currChar-'a']=true;
            removedup(s,i+1,news.append(currChar),map);
        }
    }
    public static int pairfrnds(int n ){
        if(n==1||n==2){
            return n;
        }
        return pairfrnds(n-1)+(n-1)*pairfrnds(n-2);
    }
    public static void binaryString(int n,int lastplace,String str){      //print all binary string with no consecutive one  of size n     
          //base case
           if(n==0){
            System.out.println(str);
           return;
           }
            binaryString(n-1,0,str+"0");
            if(lastplace==0){
                binaryString(n-1,1,str+"1");
            }
    }
    
}