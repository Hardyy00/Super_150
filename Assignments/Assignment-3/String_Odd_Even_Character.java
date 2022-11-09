import java.util.*;
class Main {
    public static void main(String args[]) {
        
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();

        String ans = "";

        for(int i=0; i<s.length();i++){

            char ch = s.charAt(i);

            if(i%2==0){
                ans += ++ch;
            }else{
                ans += --ch;
            }
        }

        System.out.println(ans);
        cin.close();
    }

    
}
