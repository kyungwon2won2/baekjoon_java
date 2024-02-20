package StepByStep;

import java.util.Scanner;

public class No_8_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int V = scan.nextInt();
		
//		int result=0;
//		int cnt=0;
//		while(true) {
//			result += A;
//			cnt++;
//			if(result<V) {
//				result -= B;
//			}else {
//				System.out.println(cnt);
//				break;
//			}
//		}
		
		int cnt=0;
		//A-B: 하루에 올라간 길이
		//V-B는 마지막날빼고,,
		if((V-B)%(A-B) != 0) {
			System.out.println((V-B)/(A-B)+1);
		}else {
			System.out.println((V-B)/(A-B));
		}

	}

}
