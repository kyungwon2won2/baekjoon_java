package StepByStep;

import java.util.Scanner;

public class No_4_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[30];
		
		for(int i=0; i<28; i++) {
			int num = scan.nextInt();
			for(int j=0; j<30; j++) {
				if(num == j+1) arr[j]=1;
			}
		}
		
		for(int i=0; i<30; i++) {
			if(arr[i] != 1){
				System.out.println(i+1);
			}
		}

	}
	
}
