import java.util.*;
class Main {
    public static void main(String args[]) {

        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();

        while(t-->0){

            int m = cin.nextInt();
            String[] s = new String[m];

            for(int i=0;i<m;i++) {
                int num = cin.nextInt();
                s[i] = Integer.toString(num);
            }

            sort(s);

            String ans = "";
            for(int i=0;i<m;i++){
                ans+=s[i];
            }
            System.out.println(ans);
        }
        cin.close();

    }

    private static void sort(String[] s){


        for(int i=0;i<s.length;i++){
            int max = i;
            for(int j=i;j<s.length;j++){
                
                if(sortingCompare(s[max] , s[j]) < 0){
                     max = j;
                 }
            }
            
            String temp = s[i];
            s[i] = s[max];
            s[max] = temp;
        }
 
     }


    private static int sortingCompare(String a , String b ){
        
        String aPlusB = a+b;
        String bPlusA = b+a;
        
        return compare(aPlusB,bPlusA);
        

        // int i=0;
        // int j=0;
        // while(i<a.length() && j<b.length()){

        //     char c1 = a.charAt(i);
        //     char c2 = b.charAt(j);

        //     if(c1!=c2)
        //         return c1-c2;

        //     i++;
        //     j++;

        // }

        // if(a.length() < b.length()){

        //     for(int k=j;k<b.length();k++){

        //     // System.out.println("i = " +(i-1)+ " k : " +k +"a = " + a.charAt(i-1) + "  b = " + b.charAt(k) + " a < b : " + ( a.charAt(i-1) < b.charAt(k)) );
        //         if(a.charAt(i-1) > b.charAt(k))
        //             return 1;
        //         if(a.charAt(i-1) < b.charAt(k))
        //             return -1;
        //     }

        // }else if(b.length() < a.length()){

        //     for(int k=i;k<a.length();k++){
        //         if(b.charAt(j-1) > a.charAt(k))
        //             return -1;
        //         else if(b.charAt(j-1) < a.charAt(k))
        //             return 1;
        //     }
        // }

        // return 0;
    }
    
    private static int compare(String a , String b){
        
        int i=0;
        int j=0;
        
        while(i<a.length() && j<b.length()){
            
            char c1 = a.charAt(i);
            char c2 = b.charAt(j);
            
            if(c1!=c2)
                return c1-c2;
                
            i++;
            j++;
        }
        
        return 1;
    }
}
