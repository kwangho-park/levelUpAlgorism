package step3;

import java.util.Scanner;

public class Baek2438_star1 {

	public static void main(String[] args) {
		int n;		// �Է°� ���� 1<= n <=100
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		

		for(int loop1=1 ; loop1<=n ; loop1++) {		// ��(����)�� ����ϴ� �ݺ���
			for(int loop2=1 ; loop2<=loop1 ; loop2++) {
				System.out.print("*");
			}
			System.out.println();
		}

		

			
	}
}
