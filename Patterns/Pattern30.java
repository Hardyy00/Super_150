package patterns.com.hardik;

import java.util.Scanner;

public class Pattern30 {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n= cin.nextInt();

        int row = 1;

        while(row<=n){

            int i=n;
            while (i>0){
                System.out.print(i + "  ");
                i--;
            }

            row++;
            System.out.println();
        }
        cin.close();
    }
}
