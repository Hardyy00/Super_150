import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();

        int d = (b * b) - (4 * a * c);

        if (d >= 0) {
            String ans = "Real";
            if (d == 0)
                ans += " and Equal";
            else
                ans += " and Distinct";

            int x = (int) ((-b + Math.sqrt(d)) / (2 * a));
            int y = (int) ((-b - Math.sqrt(d)) / (2 * a));

            int big = x > y ? x : y;
            System.out.println(ans);
            System.out.println((x + y - big) + " " + big);

        } else {
            System.out.println("Imaginary");
        }

        cin.close();
    }
}