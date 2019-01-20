package step3;

import java.util.Scanner;

public class Baek2438_star1 {

	public static void main(String[] args) {
		int n;		// 입력값 범위 1<= n <=100
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		

		for(int loop1=1 ; loop1<=n ; loop1++) {		// 열(세로)를 출력하는 반복문
			for(int loop2=1 ; loop2<=loop1 ; loop2++) {
				System.out.print("*");
			}
			System.out.println();
		}

		

			
	}
}
