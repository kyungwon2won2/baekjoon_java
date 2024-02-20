package StepByStep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No_9_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		List<Integer> lst = new ArrayList<Integer>();
		
		for(int i=M; i<=N; i++) {
			int cnt = 0;
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				lst.add(i);
			}	
		}
		int sum=0;
		if(lst.size()==0) {
			System.out.println("-1");
		} else {
			for(int i=0; i<lst.size(); i++) {
			sum+=lst.get(i);
			}
			System.out.println(sum);
			System.out.println(lst.get(0));
		}

	}

}
