import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            long n = cin.nextLong();
            long lower = 1;
            long higher = n;
            long ans = 0;
            while (lower <= higher) {

                long mid = lower + (higher - lower) / 2;
                if (mid * mid <= n) {
                    ans = mid;
                    lower = mid + 1;
                } else {
                    higher = mid - 1;
                }

            }

            double num = getFullNumber(ans, n);
            System.out.println(String.format("%.4f", num));

        }
        cin.close();

    }

    private static double getFullNumber(long ans, long n) {

        double add = 0.1;
        double fullAnswer = ans;
        for (int i = 1; i <= 4; i++) {

            while (fullAnswer * fullAnswer <= n) {
                fullAnswer += add;
            }

            fullAnswer -= add;
            add /= 10;
        }

        return fullAnswer;
    }
}
