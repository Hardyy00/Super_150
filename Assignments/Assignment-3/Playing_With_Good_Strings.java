import java.util.*;
class Main {
    public static void main(String args[]) {
        
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();

        String ans = "";
        String temp = "";

        for(int i=0; i<s.length();i++){

            char ch = s.charAt(i);

            if(isVowel(ch)){
                temp += ch;
            }else{
                temp = "";
            }

            if(temp.length()>ans.length())
                ans = temp;
        }

        System.out.println(ans.length());
        cin.close();
    }

    private static boolean isVowel(char ch){
        
        switch(ch){
            case 'a' : 
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                return true;
            default :
                return false;
        }
    }


}
