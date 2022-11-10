import java.util.*;
class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();

        int[][] mat = new int[n][m];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]  = cin.nextInt();
            }
        }

        int x = cin.nextInt();

        System.out.println(isElementPresent(mat ,x ));
        cin.close();
    }

    private static int isElementPresent(int[][] mat ,int x){

        int row = 0;
        int col = mat[0].length-1;

        while(row<mat.length && col>-1){

            if(x<mat[row][col]){
                col--;
            }else if(x>mat[row][col]){
                row++;
            }else{
                return 1;
            }

        }

        return 0;
    }
}