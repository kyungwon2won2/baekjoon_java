package StepByStep;

import java.util.Scanner;

public class No_8_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String N = scan.next();
		int B = scan.nextInt();
		
		int result = 0;
		int cnt = 1;
		for(int i=N.length()-1; i>=0; i--) {
			char c = N.charAt(i);
			
			if('A'<=c && c<='Z') {
				result += (c-'A'+10)*cnt;
			}else {
				result += (c-'0')*cnt;
			}
			cnt *= B;
		}
		
		System.out.println(result);

	}

}
