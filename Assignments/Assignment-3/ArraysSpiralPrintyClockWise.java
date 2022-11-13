import java.util.*;
class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int m = cin.nextInt();
        int n = cin.nextInt();

        int[][] mat = new int[m][n];

        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){

                mat[i][j] = cin.nextInt();
            }
        }

        printSpiral(mat);
        cin.close();
    }

    private static void printSpiral(int[][] mat){

        int minRow = 0;
        int maxRow = mat.length-1;
        int minCol = 0;
        int maxCol = mat[0].length-1;

        int totalElements = mat.length * mat[0].length;
        int count = 0;
        while(count < totalElements){

            for(int i=minCol;i<=maxCol && count<totalElements ;i++){
                System.out.print(mat[minRow][i] + ", ");
                count++;
            }
            minRow++;

            for(int i=minRow;i<=maxRow && count < totalElements;i++){
                System.out.print(mat[i][maxCol] + ", ");
                count++;
            }
            maxCol--;

            for(int i=maxCol;i>=minCol && count < totalElements;i--){
                System.out.print(mat[maxRow][i] + ", ");
                count++;

            }

            maxRow--;

            for(int i=maxRow; i>=minRow && count < totalElements ; i--){
                System.out.print(mat[i][minCol] + ", ");
                count++;

            }

            minCol++;
        }

        System.out.print("END");
    }
}