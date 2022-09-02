package patterns.com.hardik;

import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int space = n-1;
        int star = 1;

        while(row<=n){

            int i=1;
            while(i<=space){
                System.out.print("   ");
                i++;
            }

            i=1;
            while(i<=star){
                String s = i%2!=0 ? "*  " : "!  ";
                System.out.print(s);
                i++;
            }

            space--;
            star +=2;
            row++;
            System.out.println();
        }
        cin.close();
    }
}
