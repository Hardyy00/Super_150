import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int column = 1;

        while (row <= n) {

            int i = 1;
            while (i <= column) {

                int var = 0;
                if (i == 1 || i == column)
                    var = row;

                System.out.print(var + "\t");
                i++;

            }

            row++;
            column++;
            System.out.println();
        }
        cin.close();

    }
}