import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = cin.nextInt();

        int sum = cin.nextInt();

        findSum(arr, sum);

        cin.close();

    }

    private static void findSum(int[] arr, int sum) {

        for (int i = 0; i < arr.length; i++) {

            int remainingNumber = sum - arr[i];

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] == remainingNumber) {
                    String ans = Math.min(arr[i], arr[j]) + " and " + Math.max(arr[i], arr[j]);
                    System.out.println(ans);
                }
            }
        }
    }
}