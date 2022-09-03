package patterns.com.hardik;

import java.util.Scanner;

public class Pattern33 {

    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();


        int row = 1;
        int column = 1;
        int space = n-1;

        while (row<=n){

            int i=1;
            while (i<=space){
                System.out.print("   ");
                i++;
            }

            i=1;
            int k=n-(row-1);

            if(row==1){
                k=0;
            }

            String s = k + "";
            while (i<=column){

                System.out.print(s + "  ");
                if(i<column/2){
                    k++;
                    s = k + "";
                }else if(i==column/2){
                    s = "0";
                }else{
                    s = k + "";
                    k--;
                }
                i++;
            }

            column+=2;
            row++;
            space--;
            System.out.println();
        }
        cin.close();
    }
}
