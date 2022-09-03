package patterns.com.hardik;

import java.util.Scanner;

public class Pattern29 {

    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int column = 1;
        int space = n-1;

        while(row<=n){

            int i=1;
            while (i<=space){
                System.out.print("   ");
                i++;
            }

            i=1;
            while (i<=column){

                String s = i==1 || i==column ? String.valueOf(row) : "0";

                System.out.print(s + "  ");
                i++;
            }

            space--;
            column+=2;
            row++;
            System.out.println();
        }
        cin.close();
    }
}
