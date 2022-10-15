import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int m = cin.nextInt();
            int n = cin.nextInt();

            for (int i = 1; m > 0 && n > 0; i++) {

                if (i % 2 != 0)
                    m -= i;
                else
                    n -= i;

                if (m <= 0) {
                    System.out.println("Harshit");
                    break;
                } else if (n <= 0) {
                    System.out.println("Aayush");
                    break;
                }
            }

        }
        cin.close();
    }
}