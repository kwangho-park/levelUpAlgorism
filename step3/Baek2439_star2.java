package step3;

import java.util.Scanner;

public class Baek2439_star2 {

	public static void main(String[] args) {
		int n;		// �Է°��� ���� 1 <= n <= 100
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		
		for(int i=0 ; i<n ; i++) {
			for(int j=0;j<(n-i-1);j++) {
				
				System.out.print(" ");
				
			}
			for(int j=0 ; j<= i ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		/*
		for(int loop1=1 ; loop1<=n ; loop1++) {		// ��(����)�� ����ϴ� �ݺ���

			for(int loop2=1 ; loop2<= n-loop1 ; loop2++) {

				System.out.print(" ");
			}
			
			for(int loop3=1 ; loop3<=loop1 ; loop3++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
	}
}
