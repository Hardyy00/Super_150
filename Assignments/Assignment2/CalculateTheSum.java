import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        long[] arr = new long[n];
        long[] copyArr = new long[n];

        long sum = 0l;

        for (int i = 0; i < n; i++) {
            long temp = cin.nextLong();
            arr[i] = temp;
            copyArr[i] = temp;
            sum += temp;
        }

        int q = cin.nextInt();

        while (q-- > 0) {
            sum = 0l;
            int x = cin.nextInt();
            x = x % n;
            rotateArray(copyArr, x);

            for (int i = 0; i < n; i++) {
                arr[i] += copyArr[i];
                copyArr[i] = arr[i];
                if (q == 0)
                    sum += arr[i];
            }

        }

        System.out.println(sum % ((int) Math.pow(10, 9) + 7));
        cin.close();

    }

    public static void rotateArray(long[] arr, int x) {

        reverseArray(arr, arr.length - x, arr.length - 1);
        reverseArray(arr, 0, arr.length - x - 1);
        reverseArray(arr, 0, arr.length - 1);

    }

    private static void reverseArray(long[] arr, int i, int j) {

        while (i < j) {
            long temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}