package step3;

import java.util.Scanner;

public class baek2441_star4 {

	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		for(int loop1=0 ; loop1<n ; loop1++) {		// 행을 출력하는 반복문 
			
			for(int loop2=0; loop2<loop1 ; loop2++) {		// 열의 공백을 출력하는 반복문
				System.out.print(" ");
			}
			
			for(int loop3=0 ; loop3<n-loop1 ; loop3++) {	// 열의 별을 출력하는 반복문
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
