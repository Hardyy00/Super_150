import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int row = 1;
        int star = 1;
        int k = 1;

        while (row <= n) {

            int i = 1;
            while (i <= star) {
                System.out.print(k + "\t");
                i++;
                k++;
            }

            row++;
            star++;
            System.out.println();
        }
        cin.close();
    }
}
