import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();

        char pre = s.charAt(0);
        String ans = "" + pre;
        for(int i=1;i<s.length();i++){

            char curr = s.charAt(i);

            if(curr!=pre)
                ans += curr;
            
            pre = curr;
        }

        System.out.println(ans);
        cin.close();
    }
}
