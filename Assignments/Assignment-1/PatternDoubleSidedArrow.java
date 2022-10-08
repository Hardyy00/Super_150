import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int column = 1;
        int backSpace = n - 1;
        int space = -1;

        while (row <= n) {

            int i = 1;
            while (i <= backSpace) {
                System.out.print("  ");
                i++;
            }

            i = column;
            while (i > 0) {
                System.out.print(i-- + " ");
                ;
            }

            i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            i = 1;
            if (row == 1 || row == n)
                i = 2;

            while (i <= column) {
                System.out.print(i++ + " ");
            }

            if (row <= n / 2) {
                backSpace -= 2;
                column++;
                space += 2;
            } else {
                backSpace += 2;
                column--;
                space -= 2;
            }

            row++;
            System.out.println();
        }
        cin.close();

    }
}