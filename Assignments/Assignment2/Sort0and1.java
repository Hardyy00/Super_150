import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[] arr = new int[n];
        int indexForZero = 0;
        int indexForOne = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            int temp = cin.nextInt();

            if (temp == 0) {
                arr[indexForZero] = temp;
                indexForZero++;
            } else if (temp == 1) {
                arr[indexForOne] = temp;
                indexForOne--;
            }
        }

        for (int i : arr)
            System.out.print(i + " ");

        cin.close();
    }
}
