
import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 0;
        int column = 1;

        while (row < n) {

            int i = 0;
            int var = 1;
            while (i < column) {
                System.out.print(var + "\t");
                var = ((row - i) * var) / (i + 1);
                i++;
            }

            row++;
            column++;
            System.out.println();
        }

        cin.close();
    }
}