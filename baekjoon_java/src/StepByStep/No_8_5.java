package StepByStep;

import java.util.Scanner;

public class No_8_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int range = 1;
		int cnt = 0;
		while(true) {
			range = range + 6*cnt;
			if(N<=range) {
				System.out.println(cnt+1);
				break;
			} else {
				cnt++;
			}
		}
		
	}

}
