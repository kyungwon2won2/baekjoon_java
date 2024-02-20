package StepByStep;

import java.util.Scanner;

public class No_5_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		
		int[] arr = new int[26];
		for(int i=0; i<26; i++) {
			arr[i]=-1; //알파벳이 없으면 -1대입이어서 -1로 초기화
		}
	
		for(int i=0; i<S.length(); i++) {
			if(arr[S.charAt(i)-97]==-1) {
				arr[S.charAt(i)-97]=i;
			}
		}
		
		for(int i=0; i<26; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
