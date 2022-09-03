package patterns.com.hardik;

import java.util.Scanner;

public class Pattern31 {

    public static void main(String[] args){

        Scanner cin = new Scanner(System.in);
        int n= cin.nextInt();

        int row = 1;

        while(row<=n){

            int i=n;

            while (i>0){

                String s = i==row ? "*" : String.valueOf(i);
                System.out.print(s + "  ");
                i--;
            }

            row++;
            System.out.println();
        }
    }
}
