import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int column = 1;
        int space = 2 * n - 1;

        while (row <= 2 * n + 1) {

            int k = n;
            int i = 1;
            while (i <= column) {

                System.out.print(k + " ");
                k--;

                i++;
            }
            i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            i = 1;
            if (row == n + 1) {
                i = 2;
                k++;
            }

            while (i <= column) {

                System.out.print(++k + " ");
                i++;
            }

            if (row <= n) {
                column++;
                space -= 2;
            } else {
                column--;
                space += 2;
            }
            row++;
            System.out.println();
        }
        cin.close();

    }
}
