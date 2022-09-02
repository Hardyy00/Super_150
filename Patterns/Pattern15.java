package patterns.com.hardik;

import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {

        Scanner cin =  new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int space  = 0;
        int star = n;
        int iterations = 2*n-1;

        while(row<=iterations){

            int i=1;

            while(i<=space){
                System.out.print("   ");
                i++;
            }

            i = 1;
            while(i<=star){
                System.out.print("*  ");
                i++;
            }

            if(row<n){
                star--;
                space+=2;
            }else{
                space-=2;
                star++;
            }

            row++;
            System.out.println();
        }
        cin.close();
    }
}
