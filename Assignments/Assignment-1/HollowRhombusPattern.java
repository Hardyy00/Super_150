import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int star = n;
        int space = n - 1;

        while (row <= n) {

            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }

            i = 1;
            while (i <= star) {
                if (row == 1 || row == n || i == 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");

                i++;
            }

            row++;
            space--;
            System.out.println();

        }

        cin.close();

    }
}