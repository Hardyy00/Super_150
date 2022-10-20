import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextLong();
        }

        arr = productExceptSelf(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        cin.close();

    }

    private static long[] productExceptSelf(long[] arr) {

        long[] left = new long[arr.length];
        left[0] = 1l;

        for (int i = 1; i < arr.length; i++) {

            left[i] = left[i - 1] * arr[i - 1];

        }

        long[] right = new long[arr.length];
        right[arr.length - 1] = 1l;

        for (int i = arr.length - 2; i >= 0; i--) {

            right[i] = right[i + 1] * arr[i + 1];

        }

        for (int i = 0; i < arr.length; i++) {
            left[i] *= right[i];

        }
        return left;
    }
}