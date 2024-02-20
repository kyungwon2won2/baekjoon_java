package StepByStep;

import java.util.Scanner;

public class No_4_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			int n = scan.nextInt();
			arr[i] = n;
		}
		
		for(int i=0; i<N; i++) {
			if(arr[i]<X) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
