package StepByStep;

import java.util.Scanner;

public class No_10_7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			while(true) {
				int A = scan.nextInt();
				int B = scan.nextInt();
				int C = scan.nextInt();
				
				if(A != 0) {
				if(A == B) {
					if(B == C) {
						System.out.println("Equilateral");
					} else {
						if(B > C) {
							System.out.println("Isosceles");
						} else {
							if(C >= A+B) {
								System.out.println("Invalid");
							} else {
								System.out.println("Isosceles");
							}
						}
					}
				} else if(B == C) {
					if(C == A) {
						System.out.println("Equilateral");
					} else {
						if(C > A) {
							System.out.println("Isosceles");
						} else {
							if(A >= B+C) {
								System.out.println("Invalid");
							} else {
								System.out.println("Isosceles");
							}
						}
					}
				} else if(A == C) {
					if(C == B) {
						System.out.println("Equilateral");
					} else {
						if(C > B) {
							System.out.println("Isosceles");
						} else {
							if(B >= A+C) {
								System.out.println("Invalid");
							} else {
								System.out.println("Isosceles");
							}
						}
					}
				} else if(A != B) {
					if(B != C) {
						if(Math.max(A, Math.max(B, C)) == A) {
							if(A >= B+C) {
								System.out.println("Invalid");
							}else {
								System.out.println("Scalene");
							}
						}else if(Math.max(A, Math.max(B, C)) == B) {
							if(B >= A+C) {
								System.out.println("Invalid");
							}else {
								System.out.println("Scalene");
							}
						}else if(Math.max(A, Math.max(B, C)) == C) {
							if(C >= A+B) {
								System.out.println("Invalid");
							}else {
								System.out.println("Scalene");
							}
						}
					}
				}
				}else {
					break;
				}
			}
		}


}
