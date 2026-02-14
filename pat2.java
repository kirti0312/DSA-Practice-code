public class pat2{
    public static void rectangle(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void pyramid(int row){
        for(int i=1;i<=row;i++){
            //spaces
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pyramidno(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyds(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void zero1tri(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(n-2*i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
            }
        for(int i=n/2;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=(n-2*i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
        }
        public static void rhumbus(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void hollowrhombus(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }//spaces
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");

                    }

                }
                System.out.println();
                            }
            }
            public static void diamond(int n){ 
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=n-i;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=2*i-1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i=n;i>=1;i--){
                    for(int j=1;j<=n-i;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=2*i-1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            public static void numSpacePyramid(int n){
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=n-i;j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=i;j++){
                        System.out.print(i+" ");
                    }
                    System.out.println();
                }
            }
            public static void palindrom(int n){
                for(int i=1;i<=n;i++){
                    for(int j=1;j<=n-i;j++){
                        System.out.print(" ");
                    }
                    for(int j=i;j>=1;j--){
                        System.out.print(j);
                    }
                    for(int j=2;j<=i;j++){
                        System.out.print(j);
                    }
                    System.out.println();
                }
            }
        
    
    public static void main(String[]args){
       // rectangle(4,5);
        //pyramid(5);
       // pyramidno(4);
      // floyds(5);
      //zero1tri(5);
      //butterfly(8);
     // rhumbus(5);
     //hollowrhombus(5);
     //diamond(4);
     //numSpacePyramid(5);
     palindrom(5);
    
    }}

