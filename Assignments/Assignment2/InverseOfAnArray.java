import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = cin.nextInt();

        arr = inverseArray(arr);

        for (int a : arr)
            System.out.print(a + " ");

        cin.close();

    }

    private static int[] inverseArray(int[] arr) {

        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int ele = arr[i];
            newArray[ele] = i;
        }

        return newArray;
    }
}
