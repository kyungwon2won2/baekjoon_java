package StepByStep;

import java.util.Scanner;

public class No_6_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int arr[] = new int[str.length()];
		int c = str.length()/2;
		int j = 0;
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i)) {
				arr[i]=1;
			}else {
				arr[i]=0;
			}
		}
		int sum=0;
		for(int i=0; i<str.length()/2; i++) {
			sum+=arr[i];
		}
		if(sum==c) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}


}
