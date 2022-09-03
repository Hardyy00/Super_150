package patterns.com.hardik;

import java.util.Scanner;

public class Pattern22 {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n= cin.nextInt();

        int row =1;
        int space = -1;
        int star = n;

        while (row<=n){

            int i=1;
            while (i<=star){
                System.out.print("*  ");
                i++;
            }

            i=1;

            while (i<=space){
                System.out.print("   ");
                i++;
            }

            i=1;
            if(row==1){
                i=2;
            }
            while (i<=star){
                System.out.print("*  ");
                i++;
            }

            space+=2;
            star--;
            row++;
            System.out.println();
        }
        cin.close();
    }
}
