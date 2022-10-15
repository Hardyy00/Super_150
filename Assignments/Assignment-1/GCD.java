import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();

        while (a != b) {
            if (a > b)
                a -= b;
            else if (b > a)
                b -= a;
        }

        System.out.println(a);
        cin.close();

    }
}