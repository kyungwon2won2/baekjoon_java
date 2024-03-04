package algorithm.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class No_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr1 = new int[N];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = scan.nextInt();
		}
		int M = scan.nextInt();
		int[] arr2 = new int[M];
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = scan.nextInt();
		}
		
		int[] result = search(arr1, arr2);
		for(int data : result) {
			System.out.println(data);
		}

	}
	
	public static int[] search(int[]arr1, int[] arr2) {
		int[] result = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			result[i] = binarysearch(arr1, arr2[i]);
		}
		
		return result;
	}
	
	public static int binarysearch(int[] arr1, int target) {
		int low = 0;
		int high = arr1.length-1;
		Arrays.sort(arr1);
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(arr1[mid] == target) {
				return 1;
			} else if(arr1[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return 0;
	}

}
