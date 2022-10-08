import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int min = cin.nextInt();
        int max = cin.nextInt();
        int step = cin.nextInt();

        int i = min;
        while (i <= max) {

            int c = (5 * (i - 32)) / 9;
            System.out.println(i + " " + c);
            i += step;
        }

        cin.close();
    }
}
