package StepByStep;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class No_9_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> lst = new ArrayList<Integer>();
		while(true) {
			int n = scan.nextInt();
			int sum = 0;
			if(n == -1) break;
			for(int i=1; i<=n; i++) {
				if(n%i==0) {
					lst.add(i);
				}
			}
			for(int h=0; h<lst.size()-1; h++) {
				sum+=lst.get(h);
			}
			if(n==sum) {
				System.out.print(n+" = ");
				for(int j=0; j<lst.size()-1; j++) {
					System.out.print(lst.get(j));
					if(j<lst.size()-2) {
						System.out.print(" + ");
					}else {
						System.out.println();
						lst.clear();
					}
				}
			}else {
				System.out.println(n+" is NOT perfect.");
				lst.clear();
			}
		}

	}

}
