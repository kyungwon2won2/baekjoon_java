package StepByStep;

import java.util.Scanner;

public class No_6_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		
		String str2 = str1.toUpperCase();  //대문자로 변경
		
		int[] arr = new int[26];
		for(int i=0; i<str2.length(); i++) {
			arr[str2.charAt(i)-'A']++;
		}
		int max=arr[0];
		int idx=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==max) {
				cnt++;
				idx = i;
			}
		}
		if(cnt==1) {
			System.out.println((char)(idx+65));
		}else {
			System.out.println("?");
		}
		
	}

}
