package StepByStep;

import java.util.Scanner;

public class No_10_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		int sum = x+y+z;
		int max = Math.max(x, Math.max(y, z));
		
		if(max < sum-max) {
			System.out.println(sum);
		} else if(max == (sum-max)) {
			System.out.println(sum-1);
		} else {
			System.out.println(sum-max+sum-max-1);
		}
	}

}
