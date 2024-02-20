package StepByStep;

import java.util.Scanner;

public class No_6_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		String idx[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		//contains함수, replace함수
		for(int i=0; i<idx.length; i++) {
			if(str.contains(idx[i])) {
				str = str.replace(idx[i], "!");
			}
		}
		System.out.println(str.length());
	}

}
