import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int star = n;
        int space = -1;

        while (row <= 2 * n - 1) {

            int i = 1;
            while (i <= star) {
                System.out.print("*");
                i++;
            }

            i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }

            i = 1;
            if (row == 1 || row == 2 * n - 1)
                i++;

            while (i <= star) {
                System.out.print("*");
                i++;
            }

            if (row < n) {
                star--;
                space += 2;
            } else {
                star++;
                space -= 2;
            }
            row++;
            System.out.println();
        }

        cin.close();
    }
}