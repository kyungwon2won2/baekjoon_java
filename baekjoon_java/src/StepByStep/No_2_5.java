package StepByStep;

import java.util.Scanner;

public class No_2_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int H = scan.nextInt();
		int M = scan.nextInt();
		
		if(M<45) {
			if(H==0 ) {
				H=23;
				M+=15;
				System.out.println(H+" "+M);
			}else {
				H-=1;
				M+=15;
				System.out.println(H+" "+M);
			}
		}else{
			M-=45;
			System.out.println(H+" "+M);
		}
	}	
		
}
