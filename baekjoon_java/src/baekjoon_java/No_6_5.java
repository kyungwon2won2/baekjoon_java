package baekjoon_java;

import java.util.Scanner;

public class No_6_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int[] arr1 = new int[str.length()];
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=97) {
				arr1[i]=str.charAt(i)-32;
			}else {
				arr1[i]=str.charAt(i);
			}
		}
		
		int[] arr2 = new int[28];
		for(int i=0; i<arr2.length; i++) {
			arr2[i]=0;
		}
		for(int i=0; i<str.length(); i++) {
			arr2[arr1[i]-65]++;
		}
		int max = arr2[0];
		int maxIdx = 0;
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i]>=max) {
				maxIdx = i+65;
			}
		}
		int cnt=0;
		for(int i=0; i<arr2.length; i++) {
			if(arr2[i]==max) {
				cnt++;
			}
		}
		if(cnt>=2) {
			System.out.println("?");
		}else {
			System.out.println((char)maxIdx);
		}
		
	}

}
