package baekjoon_java;

import java.util.Scanner;

public class No_3_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int j;
		for(int i=1; i<=N; i++) {
			for(j=0; j<=N-i-1; j++) {
				System.out.print(" ");
			}
			for(j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
