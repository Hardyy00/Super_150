import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {

            int temp = cin.nextInt();
            arr[i] = (long) temp * temp;
        }

        sortSquare(arr);

        for (long a : arr)
            System.out.print(a + " ");

        cin.close();
    }

    private static void sortSquare(long[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            long temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

}