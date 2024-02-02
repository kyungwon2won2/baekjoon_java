package baekjoon_java;

import java.util.Scanner;

public class No_2_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}else if(A<B) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
	}

}
