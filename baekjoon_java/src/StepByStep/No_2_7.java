package StepByStep;

import java.util.Scanner;

public class No_2_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if(x==y) {
			if(y==z) {
				System.out.println(10000+x*1000);
			}else {
				System.out.println(1000+x*100);
			}
		}else {
			if(y==z) {
				System.out.println(1000+y*100);
			}else {
				if(x>y) {
					if(z>x) {
						System.out.println(z*100);
					}else if(x==z) {
						System.out.println(1000+x*100);
					}else {
						System.out.println(x*100);
					}
				}else {
					if(z>y) {
						System.out.println(z*100);
					}else if(z==x) {
						System.out.println(1000+x*100);
					}else {
						System.out.println(y*100);
					}
				}
			}
			
		}
		
		
	}

}
