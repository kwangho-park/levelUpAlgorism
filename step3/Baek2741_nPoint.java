

/* 반복문을 이용한 오름차순 출력*/

package step3;

import java.util.Scanner;

public class Baek2741_nPoint {

	public static void main(String[] args) {
		
		int n;		// 입력값 : n <= 100,000
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		for(int loop = 1 ; loop <= n; loop++) {
			System.out.println(loop);
		}
	}

}
