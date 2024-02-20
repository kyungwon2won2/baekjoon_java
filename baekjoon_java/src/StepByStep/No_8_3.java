package StepByStep;

import java.util.Scanner;

public class No_8_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int q=0;
		int d=0;
		int n=0;
		int p=0;
		for(int i=0; i<T; i++) {
			int C = scan.nextInt();
			q = C/25;
			C %= 25;
			d = C/10;
			C %= 10;
			n = C/5;
			C %= 5;
			p = C;
			
			System.out.println(q+" "+d+" "+n+" "+p);
		}

	}

}
