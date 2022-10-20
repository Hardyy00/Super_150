import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = cin.nextInt();
            }

            System.out.println(getTrappedWater(arr));
        }

        cin.close();
    }

    private static int getTrappedWater(int[] arr) {

        int[] left = new int[arr.length];
        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {

            left[i] = Math.max(left[i - 1], arr[i]);
        }

        int[] right = new int[arr.length];
        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {

            right[i] = Math.max(right[i + 1], arr[i]);
        }

        int trappedWater = 0;

        for (int i = 0; i < arr.length; i++) {
            trappedWater += Math.min(left[i], right[i]) - arr[i];
        }

        return trappedWater;
    }
}