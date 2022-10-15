import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int column = 1;
        int space = n + 1;

        while (row <= n) {

            int i = 1;
            while (i <= column) {
                System.out.print(i + "\t");
                i++;
            }

            int j = 1;
            while (j <= space) {
                System.out.print(" " + "\t");
                j++;
            }

            int var = i;
            i = 1;
            if (row == n) {
                --var;
                i = 2;
            }

            while (i <= column) {
                System.out.print(--var + "\t");
                i++;
            }

            space -= 2;
            column++;
            row++;
            System.out.println();
        }

        cin.close();

    }
}