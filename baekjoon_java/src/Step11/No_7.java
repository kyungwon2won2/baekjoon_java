package Step11;

import java.util.Scanner;

public class No_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int n = scan.nextInt();
		
		if(a>c) {
			System.out.println(0);
		} if(a<=c) {
			if(c>=n) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		} 
	}

}
