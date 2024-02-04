package baekjoon;

import java.util.Scanner;

public class No_5_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String str = scan.next();
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum+=(str.charAt(i)-'0');//아스키코드반환 -> '0'빼줘야함
		}
		System.out.println(sum);
	}

}
