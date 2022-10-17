import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }

        int m = cin.nextInt();

        int index = getIndex(arr, m);

        System.out.println(index);

        cin.close();
    }

    private static int getIndex(int[] arr, int m) {

        int lower = 0;
        int higher = arr.length - 1;

        while (lower <= higher) {

            int mid = lower + (higher - lower) / 2;

            if (arr[mid] < m) {
                lower = mid + 1;
            } else if (arr[mid] > m) {
                higher = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}