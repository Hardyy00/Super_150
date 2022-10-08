import java.util.*;

class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        char a = cin.next().charAt(0);

        String ans = "Invalid";

        if (a >= 65 && a <= 90)
            ans = "UPPERCASE";
        else if (a >= 97 && a <= 122)
            ans = "lowercase";

        System.out.println(ans);

        cin.close();

    }
}