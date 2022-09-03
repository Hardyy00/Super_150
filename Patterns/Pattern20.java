package patterns.com.hardik;

import java.util.Scanner;

public class Pattern20 {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int n= cin.nextInt();

        int row = 1;
        int space = n/2;
        int star = 1;

        while(row <= n){

            int i=1;

            while(i<=space){
                System.out.print("   ");
                i++;
            }

            i=1;
            while(i<=star){
                if(i==1 || i==star){
                    System.out.print("*  ");
                }else{
                    System.out.print("   ");
                }
                i++;
            }

            if(row<=n/2){
                space--;
                star+=2;
            }else{
                space++;
                star-=2;
            }

            row++;
            System.out.println();
        }
        cin.close();
    }
}
