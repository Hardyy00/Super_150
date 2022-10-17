import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < n; i++)
            prices[i] = cin.nextInt();

        int q = cin.nextInt();
        while (q-- > 0) {

            int price = cin.nextInt();
            int k = cin.nextInt();

            int count = 0;

            for (int i = 0; i < n; i++) {
                if (price % prices[i] == 0)
                    count++;
            }

            String ans = count >= k ? "Yes" : "No";
            System.out.println(ans);
        }

        cin.close();
    }
}