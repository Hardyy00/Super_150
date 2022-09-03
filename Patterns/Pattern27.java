package patterns.com.hardik;

import java.util.Scanner;

public class Pattern27 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int column = 1;
        int space =n-1;

        while (row<=n){
            int i=1;
            while(i<=space){
                System.out.print("   ");
                i++;
            }

            i=1;
            int k=1;
            while (i<=column){

                System.out.print(k + "  ");
                if(i<=column/2){
                    k++;
                }else{
                    k--;
                }

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
