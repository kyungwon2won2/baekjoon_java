package StepByStep;

import java.util.Scanner;

public class No_8_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int s = 2;
		int result = 1;
		for(int i=0; i<N; i++) {
			s= 2*s-1;
		}
		result = s*s;
		System.out.println(result);

	}

}
