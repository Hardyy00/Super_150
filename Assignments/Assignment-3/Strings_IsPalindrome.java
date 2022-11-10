import java.util.*;
class Main {
    public static void main(String args[]) {
        
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();

        System.out.println(isPalindrome(s));

        cin.close();
    }

    private static boolean isPalindrome(String s){

        int i=0;
        int j=s.length()-1;

        while(i<j){

            if(s.charAt(i)!=s.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;

    }

}
