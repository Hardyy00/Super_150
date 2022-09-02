package patterns.com.hardik;

import java.util.Scanner;

public class Pattern14 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int space = n-1;
        int star = 1;
        int iterations = 2*n -1;
        while (row<=iterations){

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

            if(row<n){
                star++;
                space--;
            }else{
                star--;
                space++;
            }

            row++;
            System.out.println();
        }
        cin.close();
    }
}
