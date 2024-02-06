package baekjoon_java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class No_5_8 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		
//		int cnt = 1;
//		if(str.length()==0) System.out.println("0");
//		else {
//		for(int i=1; i<str.length()-1; i++) {
//			if(str.charAt(i)==' '&& i!=0 && i!=str.length()-1) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
//		}
		
		
		//StringTokenizer 함수 사용
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    
	    StringTokenizer st = new StringTokenizer(str," ");
	    
	    System.out.println(st.countTokens());
	
	}
}
