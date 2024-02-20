package StepByStep;

import java.util.Scanner;

public class No_2_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if((B+C)>=60) {
			if((A+(B+C)/60)>=24) {
				A=A+(B+C)/60-24;
				B=(B+C)%60;
				System.out.println(A+" "+B);
			}else {
				A=A+(B+C)/60;
				B=(B+C)%60;
				System.out.println(A+" "+B);
			}
		}else {
			B=(B+C)%60;
			System.out.println(A+" "+B);
		}
	}

}
