import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        long sum = 0;
        for (int i = 0; i < n; i++) {

            sum += cin.nextLong();
            System.out.print(sum + " ");
        }

        cin.close();
    }
}