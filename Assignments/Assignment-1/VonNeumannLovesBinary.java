import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int number = cin.nextInt();

            int decimalNumber = 0;
            int mul = 1;

            while (number != 0) {

                decimalNumber += (number % 10) * mul;
                mul *= 2;
                number /= 10;
            }

            System.out.println(decimalNumber);
        }
        cin.close();
    }
}