package StepByStep;

import java.util.Scanner;

public class No_1_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result1 = num1*(num2%10);
		int result2 = num1*((num2/10)%10);
		int result3 = num1*(num2/100);
		int result4 = result1 + 10*result2 + 100*result3;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
