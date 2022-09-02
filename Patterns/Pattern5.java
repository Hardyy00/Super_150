package patterns.com.hardik;

import java.util.Scanner;

public class Pattern5 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int space = 0;
        int row = 1;
        int star = n;
        while(row<=n){

            int i=1;
            while(i<=space){
                System.out.print("   ");
                i++;
            }

            i=1;
            while(i<=star){
                System.out.print("*  ");
                i++;
            }

            star--;
            space++;
            row++;
            System.out.println();

        }

        cin.close();
    }
}
