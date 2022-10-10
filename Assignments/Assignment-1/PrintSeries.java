import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n1 = cin.nextInt();
        int n2 = cin.nextInt();

        int counter = 0;

        for (int i = 1; true; i++) {

            int value = 3 * i + 2;
            if (value % n2 != 0) {
                System.out.println(value);
                counter++;
            }

            if (counter == n1)
                break;
        }

        cin.close();
    }
}