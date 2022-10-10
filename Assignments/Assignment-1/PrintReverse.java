import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int reversedNumber = 0;

        while (n != 0) {

            reversedNumber = reversedNumber * 10 + (n % 10);

            n /= 10;
        }

        System.out.println(reversedNumber);
        cin.close();
    }
}
