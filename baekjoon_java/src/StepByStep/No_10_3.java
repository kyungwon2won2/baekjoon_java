package StepByStep;

import java.util.Scanner;

public class No_10_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arrx = new int[3];
		int[] arry = new int[3];
		for(int i=0; i<3; i++) {
			 int x = scan.nextInt();
			 int y = scan.nextInt();
			 
			 arrx[i] = x;
			 arry[i] = y;
		}
		int[] idxx = new int[1001];
		int[] idxy = new int[1001];
		for(int i=0; i<3; i++) {
			idxx[arrx[i]]++;
			idxy[arry[i]]++;
		}
		
		for(int i=1; i<=1000; i++) {
			if(idxx[i] == 1) {
				System.out.print(i + " ");
			}
		}
		for(int i=1; i<=1000; i++) {
			if(idxy[i] == 1) {
				System.out.println(i);
			}
		}
		
	}

}
