import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();

        System.out.println(isArmstrong(num));

        cin.close();

    }

    private static boolean isArmstrong(int num) {

        int sum = 0;
        int copy = num;

        int digits = (int) Math.log10(num) + 1;
        while (copy != 0) {

            sum += (int) Math.pow(copy % 10, digits);
            copy /= 10;
        }

        return num == sum;
    }

}