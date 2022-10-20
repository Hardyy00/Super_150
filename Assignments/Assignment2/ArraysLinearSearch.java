import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = cin.nextLong();

        long maxNumber = cin.nextLong();

        System.out.println(findMaxIndex(arr, maxNumber));

        cin.close();
    }

    private static int findMaxIndex(long[] arr, long maxNumber) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == maxNumber)
                return i;
        }

        return -1;

    }
}
