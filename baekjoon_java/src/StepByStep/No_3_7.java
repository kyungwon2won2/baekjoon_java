package StepByStep;

import java.util.Scanner;

public class No_3_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			System.out.printf("Case #%d: %d + %d = %d", i+1, A, B,A+B);
			System.out.println();
		}

	}

}
