package baekjoon_java;

import java.util.Scanner;

public class No_3_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		
		for(int idx=0; idx<T; idx++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A+B);
		}
	}

}
