import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        int digit = cin.nextInt();

        int count = 0;

        while (num != 0) {

            if (num % 10 == digit)
                count++;

            num /= 10;
        }

        System.out.println(count);
        cin.close();

    }
}