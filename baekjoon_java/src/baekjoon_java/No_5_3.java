package baekjoon;

import java.util.Scanner;

public class No_5_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// nextInt()를 사용하다가 nextLine()을 사용하면 오류가 발생.
		// nextInt(는 개행문자를 제거하지않아서 nextLine()이 가져가버림.
		int T = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<T; i++) {
			String str = scan.nextLine();
			System.out.print(str.charAt(0));
			System.out.println(str.charAt(str.length()-1));
		}
		
	}

}
