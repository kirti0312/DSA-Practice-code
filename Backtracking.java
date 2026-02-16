public class Backtracking{
    public static void changearr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
           printarr(arr);
            return;
        }
        //recursive call
        arr[i]=val;
        changearr(arr,i+1,val+1);  //function call step
        arr[i]=arr[i]-2;  //backtracking step

    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void findsubset(String str,String ans,int i){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                  System.out.println(ans);
            }
            return;
        }
        //recursive call
        //yes choice
        findsubset(str,ans+str.charAt(i),i+1);
        //no choice
        findsubset(str,ans,i+1);
    }
    public static void purmutation(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
           String newstr=str.substring(0,i)+str.substring(i+1);
            purmutation(newstr,ans+curr);
            
        }
    }
    public static void nqueens(char board[][],int row){
        //base
        if(row==board.length){
            printBoard(board);
            return;
        }
        //recursion
        for(int j=0;j<board.length;j++){
            board[row][j]='Q';
            nqueens(board,row+1);
            board[row][j]='.';
        }

    }
    public static void printBoard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++)
            System.out.println(board[i][j]+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
      int arr[]=new int[5];
        changearr(arr,0,1);
        printarr(arr);
        findsubset("abc","",0);
        purmutation("abc","");
    }
}