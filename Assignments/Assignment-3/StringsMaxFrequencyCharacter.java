import java.util.*;
class Main {
    public static void main(String args[]) {
        
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();

        char max = s.charAt(0);

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)>max)
                max = s.charAt(i);
        }
        max++;

        int[] sec = new int[max];

        for(int i=0;i<s.length();i++){
            sec[s.charAt(i)]++;
        }

        char maxChar = ' ';
        int maxFre = -1;
        for(int i=0;i<max;i++){
            if(sec[i]>maxFre){
                maxChar = (char)i;
                maxFre = sec[i];
            }

        }

        System.out.println(maxChar);
        cin.close();
    }
}
