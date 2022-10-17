import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();

        int[] arr = new int[n];

        int countOne = 0;
        int countZero = 0;
        for (int i = 0; i < n; i++) {
            int temp = cin.nextInt();
            arr[i] = temp;
            if (temp == 0)
                countZero++;
            else if (temp == 1)
                countOne++;

        }

        sortArray(arr, countOne, countZero);

        for (int i : arr)
            System.out.println(i);

        cin.close();

    }

    private static void sortArray(int[] arr, int countOne, int countZero) {

        for (int i = 0; i < arr.length; i++) {

            if (i < countZero)
                arr[i] = 0;
            else if (i < (countZero + countOne))
                arr[i] = 1;
            else
                arr[i] = 2;
        }
    }

}
