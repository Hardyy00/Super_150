import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int number = cin.nextInt();
        int copy = number;

        int sumOfDigits = 0;

        while (number != 0) {
            sumOfDigits += number % 10;
            number /= 10;
        }

        if (sumOfDigits == primeFactorSum(copy))
            System.out.println(1);
        else
            System.out.println(0);

        cin.close();

    }

    private static int primeFactorSum(int number) {

        int primeFactorSum = 0;
        int i = 2;
        int number2 = number;

        while (number != 1) {

            if (number % i == 0) {
                number /= i;
                if (isPrime(i)) {
                    int copy = i;
                    while (copy != 0) {
                        primeFactorSum += copy % 10;
                        copy /= 10;
                    }
                } else {
                    //
                }
            } else {
                i++;
            }

            if (i == number2)
                break;

        }

        return primeFactorSum;
    }

    private static boolean isPrime(int n) {

        int i = 2;
        while (i <= n / 2) {
            if (n % i == 0)
                return false;

            i++;
        }
        return true;
    }
}