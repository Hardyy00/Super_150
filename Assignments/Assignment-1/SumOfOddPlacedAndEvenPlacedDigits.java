import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; n != 0; i++) {

            int digit = n % 10;

            if (i % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            n /= 10;
        }

        System.out.println(oddSum + "\n" + evenSum);
        cin.close();

    }
}