package StepByStep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No_9_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int result=0;
		for(int i=0; i<N; i++) {
			int x = scan.nextInt();
			int cnt=0;
			for(int j=1; j<=x; j++) {
				if(x%j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				result++;
			}
		}
		System.out.println(result);
	}

}
