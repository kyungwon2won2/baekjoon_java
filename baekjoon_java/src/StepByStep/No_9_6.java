package StepByStep;

import java.util.Scanner;

public class No_9_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		if(N == 1) {
			System.out.println();
		}
		int num = N;
		for(int i=2; i<=N; i++) {
			while(num%i == 0) {
			System.out.println(i);
			num /= i;
			}
		}

	}

}
