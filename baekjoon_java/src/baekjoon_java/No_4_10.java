package baekjoon_java;

import java.util.Scanner;

public class No_4_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		double[] arr = new double[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		
		double max = arr[0];
		for(int i=0; i<N; i++) {
			if(arr[i]>max) max=arr[i]; 
		}
		
		double sum=0;
		for(int i=0; i<N; i++) {
			arr[i]=arr[i]/max*100;
			sum+=arr[i];
		}
		
		double avg= sum/N;
		
		System.out.println(avg);
		
	}

}
