package step3;

import java.util.Scanner;

public class baek2441_star4 {

	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		for(int loop1=0 ; loop1<n ; loop1++) {		// ���� ����ϴ� �ݺ��� 
			
			for(int loop2=0; loop2<loop1 ; loop2++) {		// ���� ������ ����ϴ� �ݺ���
				System.out.print(" ");
			}
			
			for(int loop3=0 ; loop3<n-loop1 ; loop3++) {	// ���� ���� ����ϴ� �ݺ���
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
