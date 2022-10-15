import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int inverseNumber = 0;

        for (int i = 1; n != 0; i++) {

            int rem = n % 10;

            inverseNumber += (int) (i * Math.pow(10, rem - 1));

            n /= 10;
        }

        System.out.println(inverseNumber);

        cin.close();

    }
}