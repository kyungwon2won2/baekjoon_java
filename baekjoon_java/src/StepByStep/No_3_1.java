package StepByStep;

import java.util.Scanner;

public class No_3_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int idx=1; idx<=9; idx++) {
			System.out.println(N+" * "+idx+" = "+(N*idx));
		}

	}

}
