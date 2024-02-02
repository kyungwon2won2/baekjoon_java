package baekjoon_java;

import java.util.Scanner;

public class No_4_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			int n = scan.nextInt();
			arr[i] = n;
		}
		int v = scan.nextInt();
		int cnt=0;
		
		for(int i=0; i<N; i++) {
			if(arr[i]==v) cnt++;
		}
		System.out.println(cnt);
	}

}
