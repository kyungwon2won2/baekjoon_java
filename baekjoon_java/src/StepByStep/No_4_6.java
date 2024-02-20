package StepByStep;

import java.util.Scanner;

public class No_4_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] arr = new int[N];
		for(int idx=0; idx<N; idx++) {
			arr[idx] = idx+1;
		}
		
		int temp;
		for(int idx=0; idx<M; idx++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			temp = arr[i-1];
			arr[i-1]=arr[j-1];
			arr[j-1]=temp;
		}
		
		for(int idx=0; idx<N; idx++) {
			System.out.print(arr[idx]+" ");
		}
	}

}
