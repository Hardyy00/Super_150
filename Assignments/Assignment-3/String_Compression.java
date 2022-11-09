import java.util.*;
class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();

        char pre = s.charAt(0);
        String ans = "" + pre;
        int count = 1;

        for(int i=1; i<s.length();i++){

            char curr = s.charAt(i);
            if(curr == pre){
                count++;
            }else{
                
                ans+=count;
                ans+=curr;
                count=1;
            }
            pre = curr;
        }

        ans += count;

        System.out.println(ans);
        cin.close();
    }
}