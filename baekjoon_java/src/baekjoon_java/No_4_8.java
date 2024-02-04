package baekjoon;

import java.util.Scanner;

public class No_4_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[42];
		for(int i=0; i<10; i++) {
			int idx = scan.nextInt();
			arr[idx%42]+=1;
		}
		
		int cnt=0;
		for(int i=0; i<42; i++) {
			if(arr[i]>=1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
