package StepByStep;

import java.util.Scanner;

public class No_3_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			if(A==0&&B==0) break;
			System.out.println(A+B);
		}

	}

}
