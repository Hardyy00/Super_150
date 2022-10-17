import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = cin.nextInt();

            int m = cin.nextInt();

            int minDiff = Integer.MAX_VALUE;
            int price1 = 0;
            int price2 = 0;

            for (int i = 0; i < n; i++) {
                int p1 = arr[i];
                int remainingNumber = m - p1;

                for (int j = i + 1; j < n; j++) {
                    int p2 = arr[j];
                    int diff = Math.abs(p1 - p2);

                    if (p2 == remainingNumber && diff < minDiff) {
                        minDiff = diff;
                        price1 = p1;
                        price2 = p2;
                    }

                }
            }

            System.out.println("Deepak should buy roses whose prices are " + Math.min(price1, price2) + " and "
                    + Math.max(price1, price2) + ".");

        }

        cin.close();
    }
}