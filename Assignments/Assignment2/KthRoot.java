import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            long n = cin.nextLong();
            long k = cin.nextLong();

            long lower = 1;
            long higher = n;
            long ans = 0;
            while (lower <= higher) {

                long mid = lower + (higher - lower) / 2;

                if (Math.pow(mid, k) <= n) {
                    ans = mid;
                    lower = mid + 1;
                } else {
                    higher = mid - 1;
                }
            }

            System.out.println(ans);
        }
        cin.close();
    }
}

public class KthRoot {

}
