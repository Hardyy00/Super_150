import java.util.*;
class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();

        System.out.print(s.charAt(0));

        for(int i=1;i<s.length();i++){
            
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                System.out.println();
            }

            System.out.print(s.charAt(i));
        }

        cin.close();

    }
}public class Can_You_Read_This {
    
}
