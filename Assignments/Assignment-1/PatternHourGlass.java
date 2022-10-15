import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int column = 2 * n + 1;
        int space = 0;
        int start = n;
        int totalRows = 2 * n + 1;

        while (row <= totalRows) {

            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int var = start;
            i = 1;
            while (i <= column) {

                System.out.print(var + " ");

                if (i <= column / 2)
                    var--;
                else
                    var++;

                i++;
            }

            if (row <= n) {
                start--;
                space++;
                column -= 2;
            } else {
                start++;
                space--;
                column += 2;
            }

            row++;
            System.out.println();

        }

        cin.close();

    }
}