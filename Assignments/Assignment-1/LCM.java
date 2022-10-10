import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n1 = cin.nextInt();
        int n2 = cin.nextInt();

        long max = n1 > n2 ? n1 : n2;

        while (true) {

            if (max % n1 == 0 && max % n2 == 0) {
                System.out.println(max);
                break;
            }

            max++;
        }

        cin.close();
    }
}