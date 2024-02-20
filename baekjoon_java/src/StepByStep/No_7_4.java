package StepByStep;

import java.util.Scanner;

public class No_7_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		boolean arr[][] = new boolean[100][100];
		
		for(int i=0; i<n; i++) {
			int x = scan.nextInt(); //y축에서 변까지의 길이
			int y = scan.nextInt(); //x축에서 변까지의 거리
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					arr[j][k] = true;
				}
			}
		}
		
		int cnt = 0;
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				if(arr[i][j] == true) cnt++;
			}
		}
		System.out.println(cnt);

	}

}
