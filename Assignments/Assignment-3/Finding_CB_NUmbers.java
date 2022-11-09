import java.util.*;
class Main {
        public static void main(String[] args) {
		
            Scanner cin = new Scanner(System.in);
            int n = cin.nextInt();
            cin.nextLine();
            String str = cin.nextLine();
            printSubString(str);

            cin.close();
		
	    }
	
	public static void printSubString(String str) {
		
		boolean[] visited = new boolean[str.length()];
		int count = 0;
		for(int len=1;len<=str.length();len++) {
			
			for(int j=len;j<=str.length();j++) {
				int i = j-len;
				String s = str.substring(i, j);
				long num = Long.parseLong(s);
				
				if(isCbNumber(num) && isVisited(visited ,  i, j-1)) {
					count++;
					
					for(int k=i;k<=j-1;k++) {
						visited[k] = true;
					}
				}
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean isVisited(boolean[] visited , int i , int j) {
		
		for(int k=i;k<=j;k++) {
			
			if(visited[k])
				return false;
		}
		
		return true;
	}
	
	public static boolean isCbNumber(long num) {
		
		if(num==0 || num==1) {
			return false;
		}
		
		int[] arr = {2,3,5,7,11,13,17,19,23,29};
		
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				return true;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			if(num%arr[i]==0) {
				return false;
			}
		}
		
		return true;
		
		
	}

    
}