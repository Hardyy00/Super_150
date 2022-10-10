import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);

        int sum = 0;
        while (true) {

            int number = cin.nextInt();
            sum += number;
            if (sum < 0)
                break;

            System.out.println(number);

        }
        cin.close();
    }
}