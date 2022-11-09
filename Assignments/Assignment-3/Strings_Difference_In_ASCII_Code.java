import java.util.*;
class Main {
    public static void main(String args[]) {
        
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();

        String ans = "" + s.charAt(0);

        for(int i=1;i<s.length();i++){

            char pre = s.charAt(i-1);
            char curr = s.charAt(i);

            ans += (curr-pre);
            ans += curr;
        }

        System.out.println(ans);

        cin.close();
    }
}
