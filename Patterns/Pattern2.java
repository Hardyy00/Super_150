package patterns.com.hardik;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int star = 1;
        while(row<=n){

            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }

            row++;
            star++;
            System.out.println();
        }

        cin.close();
    }
}
