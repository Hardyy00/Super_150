import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int decimalNumber = 0;
        int mul = 1;

        while (n != 0) {

            decimalNumber += (n % 10) * mul;
            mul *= 2;
            n /= 10;
        }

        System.out.println(decimalNumber);

        cin.close();

    }
}