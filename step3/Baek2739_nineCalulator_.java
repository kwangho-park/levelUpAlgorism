package step3;

import java.util.Scanner;

public class Baek2739_nineCalulator_ {

	public static void main(String[] args) {
		
		int n;		// 입력값의 범위1 <= n <= 9
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		for(int loop = 1 ;loop <= 9; loop++) {
			System.out.println(n +" * "+ loop +" = "+ n*loop);
		}
	}

}
