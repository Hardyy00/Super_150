package patterns.com.hardik;

import java.util.Scanner;

public class Pattern7 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int star = n;

        while(row<=star){
            int i=1;

            while(i<=star){

                if(row==1 || row==n || i==1 | i==n){
                    System.out.print("*  ");

                }else{
                    System.out.print("   ");
                }

                i++;
            }

            row++;
            System.out.println();
        }

        cin.close();
    }
}
