package baekjoon_java;

import java.util.Scanner;

public class No_6_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<2*i+1; j++) {
				System.out.print("*");
			
			}
			System.out.println();
		}
	}

}
