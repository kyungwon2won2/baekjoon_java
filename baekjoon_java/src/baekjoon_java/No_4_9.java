package baekjoon;

import java.util.Scanner;

public class No_4_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i]=i+1;
		}
		
		for(int idx=0; idx<M; idx++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			for(int k=i-1; k<j; k++, j--) {
				int temp;
				temp = arr[k];
				arr[k]=arr[j-1];
				arr[j-1]=temp;
			}
		}
		for(int i=0; i<N; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
