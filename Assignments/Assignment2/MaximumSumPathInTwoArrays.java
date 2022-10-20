import java.util.*;

class Main {
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {

        int t = cin.nextInt();

        while (t-- > 0) {

            int n = cin.nextInt();
            int m = cin.nextInt();

            int[] arr1 = getArray(n);
            int[] arr2 = getArray(m);
            int i = 0, j = 0;
            int max1 = 0, max2 = 0;
            int maxDistance = 0;
            while (i < n && j < m) {

                if (arr1[i] > arr2[j]) {
                    max2 += arr2[j];
                    j++;
                } else if (arr1[i] < arr2[j]) {
                    max1 += arr1[i];
                    i++;
                } else {
                    max1 += arr1[i];
                    max2 += arr2[j];
                    maxDistance += Math.max(max1, max2);

                    max1 = 0;
                    max2 = 0;
                    i++;
                    j++;
                }

            }

            if (i < n) {
                for (int k = i; k < n; k++) {
                    max1 += arr1[k];
                }
            }
            if (j < m) {
                for (int k = j; k < m; k++)
                    max2 += arr2[k];
            }

            maxDistance += Math.max(max1, max2);
            System.out.println(maxDistance);

        }

        cin.close();

    }

    private static int[] getArray(int size) {

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = cin.nextInt();
        }

        return arr;
    }
}