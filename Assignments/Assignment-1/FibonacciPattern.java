import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int column = 1;
        int k = 0;

        while (row <= n) {

            int i = 1;
            while (i <= column) {
                System.out.print(getFibonacciNumber(k) + "\t");
                i++;
                k++;

            }

            row++;
            column++;
            System.out.println();
        }

        cin.close();
    }

    private static int getFibonacciNumber(int n) {

        int a1 = 0;
        int a2 = 1;

        for (int i = 1; i <= n; i++) {
            int sum = a1 + a2;
            a1 = a2;
            a2 = sum;
        }

        return a1;
    }
}