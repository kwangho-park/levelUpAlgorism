package step3;

import java.util.Scanner;

public class Baek2440_star3 {

	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		// �ݺ��� ���� 
		// loop (��������) < n (��������)
	
		for(int loop1=0 ; loop1<n ; loop1++) {
			for(int loop2=0 ; loop2<n-loop1 ; loop2++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
