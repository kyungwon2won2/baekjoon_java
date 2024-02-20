package StepByStep;

import java.util.Scanner;

public class No_10_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		if(A+B+C == 180) {
		
			if(A == B) {
				if(B == C) {
					System.out.println("Equilateral");
				} else {
					System.out.println("Isosceles");
				}
			} else if(B == C) {
				if(C == A) {
					System.out.println("Equilateral");
				} else {
					System.out.println("Isosceles");
				}
			} else if(A == C) {
				if(C == B) {
					System.out.println("Equilateral");
				} else {
					System.out.println("Isosceles");
				}
			}else if(A != B) { 
				if(A == C) {
					System.out.println("Isosceles");
				} else { 
					System.out.println("Scalene");
				}
				if(B == C) {
					System.out.println("Isosceles");
				}
			}
		} else {
			System.out.println("Error");
		}
	}
}
