package StepByStep;

import java.util.Scanner;

public class No_6_7 {

	public static void main(String[] args)  {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int cnt = N;
		for(int i=0; i<N; i++) {
			String str = scan.next();
			boolean[] arr = new boolean[26]; //알파벳 boolean 배열 -> 초기값 false
			
			for(int j=0; j<str.length()-1; j++) {
				if(str.charAt(i) != str.charAt(i+1)) {
					if(arr[str.charAt(i+1)-97] == true) {
						cnt--;
						break;
					}
				}
				arr[str.charAt(i)-97] = true;
			}
		}
		System.out.println(cnt);
	}

}
