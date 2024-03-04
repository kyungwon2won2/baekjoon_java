package step12;

import java.util.Scanner;

public class No_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		
		int sum=0;
		int temp=0;
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					sum = arr[i]+arr[j]+arr[k];
					if(sum>=temp && sum<=M) {
						temp = sum;
					}
				}
			}
		}
		System.out.println(temp);
	}

}
