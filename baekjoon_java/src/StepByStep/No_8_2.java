package StepByStep;

import java.util.Scanner;

public class No_8_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextInt();
		int B = scan.nextInt();
		
		long k=0;
		String result = "";
		while(N>0) {
			k = N%B;
			if(k >= 10) {
				char c = (char)(k+55);
				result += c;
			}else {
				result += k;
			}
			N /= B;
		}
		
		for(int idx=result.length()-1; idx>=0; idx--) {
			System.out.print(result.charAt(idx));
		}

	}

}
