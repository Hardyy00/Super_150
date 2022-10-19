import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = cin.nextInt();
        }

        int target = cin.nextInt();

        sort(arr);

        triplets(arr, target);

        cin.close();

    }

    private static void triplets(int[] arr, int target) {

        for (int i = 0; i < arr.length - 2; i++) {
            int middleIndex = i + 1;
            int lastIndex = arr.length - 1;
            int a = arr[i];

            while (middleIndex < lastIndex) {
                int b = arr[middleIndex], c = arr[lastIndex];
                if (a + b + c < target)
                    middleIndex++;
                else if (a + b + c > target)
                    lastIndex--;
                else {
                    System.out.println(a + ", " + b + " and " + c);
                    middleIndex++;
                    lastIndex--;
                }
            }
        }
    }

    private static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min])
                    min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}