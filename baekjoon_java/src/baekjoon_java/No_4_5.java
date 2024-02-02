package baekjoon_java;

import java.util.Scanner;

public class No_4_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] arr = new int[N];
		
		for(int idx=0; idx<N; idx++) {
			arr[idx] = 0;
		}
		
		for(int idx=0; idx<M; idx++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int k = scan.nextInt();
			
			for(int l=i-1; l<j; l++ ) {
				arr[l]=k;
			}
		}
		for(int idx=0; idx<N; idx++) {
			System.out.print(arr[idx]+" ");
		}
		
	}

}
