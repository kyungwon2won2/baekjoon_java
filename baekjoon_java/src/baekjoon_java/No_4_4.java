package baekjoon_java;

import java.util.Scanner;

public class No_4_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[9];
		for(int i=0; i<9; i++) {
			int n = scan.nextInt();
			arr[i] = n;
		}
		
		int max=arr[0];
		for(int i=0; i<9; i++) {
			if(arr[i]>=max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		
		for(int i=0; i<9; i++) {
			if(max==arr[i]) {
				System.out.println(i+1);
			}
		}

	}

}
