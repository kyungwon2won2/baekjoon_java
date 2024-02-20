package StepByStep;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class No_9_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		List<Integer> lst = new ArrayList<Integer>();
		for(int i=1; i<=N; i++) {
			if(N%i == 0) {
				lst.add(i);
			}
		}

		if(lst.size() < K) {
			System.out.println("0");
		}else {
			lst.sort(Comparator.naturalOrder());
			System.out.println(lst.get(K-1));
		}
	}
}

