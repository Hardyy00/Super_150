package patterns.com.hardik;

import java.util.Scanner;

public class Pattern32 {

    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int column = 1;
        int iterations =2*n-1;
        while (row<=iterations){

            int i=1;
            while (i<=column){

                String s = i%2 ==0 ? "*" : String.valueOf(row);
                System.out.print(s + "  ");
                i++;
            }

            if(row<n){
                column+=2;
            }else{
                column-=2;
            }
            row++;
            System.out.println();
        }
    }
}
