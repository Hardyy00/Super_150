import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        long number = cin.nextLong();

        long mul = 1;
        long finalNumber = 0;

        int numberOfDigits = (int) Math.log10(number);

        for (int i = 0; number != 0; i++) {
            int digit = (int) (number % 10);
            int invertedDigit = 9 - digit;

            if (i == numberOfDigits) {

                if (invertedDigit > 0 && invertedDigit < digit)
                    finalNumber += invertedDigit * mul;
                else
                    finalNumber += digit * mul;
            } else {

                if (invertedDigit < digit)
                    finalNumber += invertedDigit * mul;
                else
                    finalNumber += digit * mul;
            }

            number /= 10;
            mul *= 10;

        }

        System.out.println(finalNumber);
        cin.close();
    }
}
