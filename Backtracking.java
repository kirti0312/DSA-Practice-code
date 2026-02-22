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
    public static int grid(int i,int j ,int n ,int m){
        //base case
        if((i==n-1&&j==m-1)){
            return 1;
        }
        else if(i==n||j==m){    //out of boundry
            return 0;
        }
        int w1=grid(i+1,j,n,m);
        int w2=grid(i,j+1,n,m);
        return w1+w2;
    }
    public static int grid_optimized(int n,int m){
        int N=n+m-2;
        int r=Math.min(n-1,m-1);
        int result =1;
        for(int i=1;i<=r;i++){
            result=result*((N-r+i)/i);
        }
        return result;
    }
    public static boolean suduko(int sudu[][],int row,int col){
        //base case
        if(row==9){
            return true;
        }

        //recursive
        int nextrow=row,nextcol=col+1;
        if(col+1==9){
            nextrow=row+1;
            nextcol=0;
        }
        if(sudu[row][col]!=0){
           return suduko(sudu,nextrow,nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudu,row,col,digit)){
                sudu[row][col]=digit;
                if(suduko(sudu,nextrow,nextcol)){
                    return true;
                }
                sudu[row][col]=0;

            }
        }
        return false;
    }
    public static boolean isSafe(int sudu[][],int row,int col,int digit){
        for(int i=0;i<9;i++){
            if(sudu[i][col]==digit){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(sudu[row][i]==digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(digit==sudu[i][j]){
                    return false;
                }
            }
        }
        
        return true;
    }
    public static void printsudu(int sudu[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudu[i][j]+" ");
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
        // char board[][]=new char[n][n];
        // for(int i=0;i<board.length;i++){
        //     for(int j=0;j<board.length;j++){
        //         board[i][j]='.';
        //     }
        // }
        // nqueens(board,0);
        // if(onesoln_nqueens(board,0)){
        //         System.out.println(board);
        // }
        // System.out.println(count);
        // System.out.println(grid(0,0,3,3));
        // System.out.println(grid_optimized(3,3));
        int sudu[][]={{0,0,8,0,0,0,0,0,0},{4,9,0,1,5,7,0,0,2},{0,0,3,0,0,4,1,9,0},{1,8,5,0,6,0,0,2,0},{0,0,0,0,2,0,0,6,0},{9,6,0,4,0,5,3,0,0},{0,3,0,0,7,2,0,0,4},{0,4,9,0,3,0,0,5,7},{8,2,7,0,0,9,0,1,3}};
        if(suduko(sudu,0,0)){
    printsudu(sudu);
} else {
    System.out.println("No solution");
}
    }
}