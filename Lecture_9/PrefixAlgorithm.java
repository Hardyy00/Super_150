package Lec9;

import java.util.Arrays;

public class PrefixAlgorithm {

	public static void main(String[] args) {
		
		int[] nums= {1,2,3,4};
		
		System.out.println(Arrays.toString(arrayExceptSelf(nums)));
		
		

	}
	
	private static int[] arrayExceptSelf(int[] arr) {
	
		int[] left = new int[arr.length];
		left[0] = 1;
		
		for(int i=1; i<left.length;i++) {
			left[i] = left[i-1] * arr[i-1];
		}
		
		int[] right = new int[arr.length];
		right[arr.length-1] = 1;
		for(int i=right.length-2;i>=0;i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		
		for(int i=0; i<arr.length; i++) {
			left[i] = left[i] * right[i];
		}
		
		return left;
		
	}
	

}
