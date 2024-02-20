package StepByStep;

import java.util.Scanner;

public class No_4_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			int n = scan.nextInt();
			arr[i] = n;
		}
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0; i<N; i++) {
			if(arr[i]>=max) max=arr[i];
		}
		
		for(int i=0; i<N; i++) {
			if(arr[i]<=min) min=arr[i];
		}
		System.out.println(min+" "+max);
	}

}
