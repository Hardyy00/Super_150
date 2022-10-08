import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int space = n / 2;
        int column = 1;

        while (row <= n) {

            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            i = 1;
            while (i <= column) {
                System.out.print("* ");
                i++;
            }

            if (row <= n / 2) {
                space--;
                column += 2;
            } else {
                space++;
                column -= 2;
            }
            row++;
            System.out.println();
        }
        cin.close();
    }
}
