import java.util.*;
public class Array2d{
    public static boolean Search(int arr[][], int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==key){
                    return true;
                }
            }
        }
        return false;
    }
    public static int largest(int a[][]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]>largest){
                    largest=a[i][j];
                }
            }
        }
        return largest;
    }
    public static void spiralMatrix(int a[][]){
        int startRow=0;
        int endRow=a.length-1;
        int startCol=0;
        int endCol=a[0].length-1;
        while(startRow<=endRow&&endRow<=endCol){
            for(int i=startCol;i<=endCol;i++){
                System.out.print(a[startRow][i]+" ");
            }
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(a[i][endCol]+" ");
            }
            for(int i=endCol-1;i>=startCol;i--){
                System.out.print(a[endRow][i]+" ");
            }
            for(int i=endRow-1;i>=startRow+1;i--){
                System.out.print(a[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static int diagonalSum(int a[][]){
        int sum=0;
      /*  for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(i==j){  //in this code odd matrix is not included
                    sum=sum+a[i][j];
                }
                elseif(i+j==a.length-1&&i!=j){
                sum=sum+a[i][j];
                }
            }
        }*/      //BRUTE FORCE APPROACH
        for(int i=0;i<a.length;i++){
            //primary diagonal
            sum=sum+a[i][i];
            //secondary diagonal
            if(i!=a.length-1-i){
            sum=sum+a[i][a.length-1-i];
        }}

        return sum;
    }
    public static boolean StaircaseSearch(int a[][],int key){
        int row=0,col=a[0].length-1;
        while(row<a.length&&col>=0){
            if(a[row][col]==key){
                System.out.println("element found at "+"("+row+","+col+")");
                return true;
            }
            else if(a[row][col]>key){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.print("key not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        int key=33;
       /* int a[][]=new int[3][4];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }*/
       /* for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();*/
        //}
       // Search(a, 7);
       // if(true){
          //  System.out.println("found");
        //}
        //else{
            //System.out.println("not found");
        //}
        //System.out.println(largest(a));
        //spiralMatrix(matrix);
       // System.out.println(diagonalSum(matrix));
       StaircaseSearch(matrix, key);
    }}
