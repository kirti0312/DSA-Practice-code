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
            count++;
            return;
        }
        //recursion
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
             board[row][j]='Q';
            nqueens(board,row+1); //function call
            board[row][j]='.'; //backtracking step
            }
            
        }
        

    }
     public static boolean onesoln_nqueens(char board[][],int row){
        
        //base
        if(row==board.length){
           // printBoard(board);
            count++;
            return true;
        }
        //recursion
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
             board[row][j]='Q';
            if(onesoln_nqueens(board,row+1)){
                return true;                    //got the solution and no need to return now it unplaced and returned from here if there was no solution then in that case we unplace and search for next
                           }; //function call
            board[row][j]='.'; //backtracking step
            }
            
        }
        
        return false;
    }
    public static boolean issafe(char board[][],int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up
        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printBoard(char board[][]){
        System.out.println("------chess------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println();
        }
        
    }
    static int count=0;   //we initialize here because recurion will change the value since it is call by value
    public static void main(String[]args){
      int arr[]=new int[5];
      int n=4;
        // changearr(arr,0,1);
        // printarr(arr);
        // findsubset("abc","",0);
        // purmutation("abc","");
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }
        nqueens(board,0);
        if(onesoln_nqueens(board,0)){
                System.out.println(board);
        }
        System.out.println(count);
    }
}