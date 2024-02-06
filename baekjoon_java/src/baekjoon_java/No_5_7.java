package baekjoon_java;

import java.util.Scanner;

public class No_5_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		

		for(int i=0; i<T; i++) {
			String P = "";
			int R = scan.nextInt();
			String S = scan.next();
			
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<R; k++) {
					P += S.charAt(j);
				}
			}
			System.out.println(P);
		}
		
	}

}
