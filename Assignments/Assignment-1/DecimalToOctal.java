import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int octalNumber = 0;
        int mul = 1;

        while (n != 0) {

            octalNumber += (n % 8) * mul;
            mul *= 10;
            n /= 8;
        }

        System.out.println(octalNumber);
        cin.close();
    }
}
