import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }

        reverseTheArray(arr);

        for (int i : arr)
            System.out.println(i);

        cin.close();

    }

    private static void reverseTheArray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}