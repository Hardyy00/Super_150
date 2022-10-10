import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();

            int evenSum = 0;
            int oddSum = 0;

            while (n != 0) {

                int digit = n % 10;

                if (digit % 2 == 0)
                    evenSum += digit;
                else
                    oddSum += digit;

                n /= 10;
            }

            String ans = "No";

            if (evenSum % 4 == 0 || oddSum % 3 == 0)
                ans = "Yes";

            System.out.println(ans);
        }

        cin.close();
    }
}