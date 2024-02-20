package StepByStep;

import java.util.Scanner;

public class No_9_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			if(x==y) {
				break;
			}else if(y%x == 0) {
				System.out.println("factor");
			}else if(x%y == 0) {
				System.out.println("multiple");
			}else {
				System.out.println("neither");
			}
		}
	}

}
