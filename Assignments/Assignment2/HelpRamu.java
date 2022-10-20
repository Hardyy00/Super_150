import java.util.*;

class Main {
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {

        int t = cin.nextInt();

        while (t-- > 0) {

            int[] prices = new int[4];
            for (int i = 0; i < 4; i++)
                prices[i] = cin.nextInt();

            int n = cin.nextInt();
            int m = cin.nextInt();

            int totalRickShawPrice = getPrice(prices, n);
            int totalCabPrice = getPrice(prices, m);

            int minPrice = Math.min(totalCabPrice + totalRickShawPrice, prices[3]);

            System.out.println(minPrice);

        }

        cin.close();
    }

    private static int getPrice(int[] prices, int count) {

        int minPrice = 0;

        for (int i = 0; i < count; i++) {

            int times = cin.nextInt();
            minPrice += Math.min(times * prices[0], prices[1]);
        }

        return Math.min(minPrice, prices[2]);
    }
}