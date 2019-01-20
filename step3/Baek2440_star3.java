package step3;

import java.util.Scanner;

public class Baek2440_star3 {

	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		// 반복의 조건 
		// loop (시작지점) < n (종료지점)
	
		for(int loop1=0 ; loop1<n ; loop1++) {
			for(int loop2=0 ; loop2<n-loop1 ; loop2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
