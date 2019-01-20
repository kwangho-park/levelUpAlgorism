

/* 반복문을 이용한 내림차순 출력*/

package step3;

import java.util.Scanner;

public class Baek2742_nPointChange {

	public static void main(String[] args) {
		
		int n;		// 입력값 : n <= 100,000
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		for(int loop = 0 ; n - loop > 0; loop++) {
			System.out.println(n-loop);
		}
	}

}
