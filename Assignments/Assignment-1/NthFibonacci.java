import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int a1 = 0;
        int a2 = 1;

        for (int i = 1; i <= n; i++) {

            int sum = a1 + a2;
            a1 = a2;
            a2 = sum;
        }

        System.out.println(a1);
        cin.close();
    }
}
