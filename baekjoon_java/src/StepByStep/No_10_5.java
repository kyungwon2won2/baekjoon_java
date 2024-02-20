package StepByStep;

import java.util.Scanner;

public class No_10_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i=0; i<n; i++) {
			arr1[i] = scan.nextInt();
			arr2[i] = scan.nextInt();
					
		}
		int max1 = arr1[0];
		int min1 = arr1[0];
		int max2 = arr2[0];
		int min2 = arr2[0];
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] > max1) {
				max1 = arr1[i];
			}
			if(arr1[i] < min1) {
				min1 = arr1[i];
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i] > max2) {
				max2 = arr2[i];
			}
			if(arr2[i] < min2) {
				min2 = arr2[i];
			}
		}
		
		System.out.println((max1-min1)*(max2-min2));
	}

}
