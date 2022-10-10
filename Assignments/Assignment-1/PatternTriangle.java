import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int space = n - 1;
        int column = 1;

        while (row <= n) {

            int i = 1;
            while (i <= space) {
                System.out.print(" \t");
                i++;
            }

            int var = row;
            i = 1;
            while (i <= column) {
                System.out.print(var + "\t");

                if (i <= column / 2) {
                    var++;
                } else {
                    var--;
                }

                i++;
            }

            space--;
            column += 2;
            row++;
            System.out.println();
        }
        cin.close();

    }
}