import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int i = 2;

        while (i <= n / 2) {

            if (n % i == 0) {
                System.out.println("Not Prime");
                break;
            }

            i++;
        }

        if (i == (n / 2) + 1)
            System.out.println("Prime");

        cin.close();
    }
}