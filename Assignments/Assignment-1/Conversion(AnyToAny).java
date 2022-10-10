import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int sb = cin.nextInt();
        int db = cin.nextInt();
        int sn = cin.nextInt();

        System.out.println(convert(sb, db, sn));
        cin.close();
    }

    private static int convert(int sb, int db, int sn) {

        if (sb != 10 && db != 10) {
            sn = convert(sb, 10, sn);
            sb = 10;
        }

        int convertedNumber = 0;
        int mul = 1;

        while (sn != 0) {

            convertedNumber += (sn % db) * mul;
            mul *= sb;
            sn /= db;
        }

        return convertedNumber;
    }

}