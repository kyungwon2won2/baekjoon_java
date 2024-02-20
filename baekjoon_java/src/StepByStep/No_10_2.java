package StepByStep;

import java.util.Scanner;

public class No_10_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		int result = Math.min(x, Math.min(y, Math.min(w-x, h-y)));
				
		System.out.println(result);

	}

}
