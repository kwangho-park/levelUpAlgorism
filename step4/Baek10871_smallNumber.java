/*
 * ���� a�� ������ x�� �Է¹޾� ������ ����� x���� �������� �Է¹��� ������� ��� 
 */
package step4;


import java.util.Scanner;

public class Baek10871_smallNumber {

	public static void main(String[] args) {
		
		int n = 0;		// ���� ����� ���� (����)
		int x = 0;		// �� ��

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x = sc.nextInt();
		
		
		int[] inputArrInt = new int[n];		// ������ �Է¹ޱ� ���� �迭

		
		// ������ ��Ҹ� �Է¹ޱ����� �ݺ���
		for(int loop=0 ; loop < n ; loop++) {
			inputArrInt[loop] = sc.nextInt();
		}


		// ������ ��� �� x�� ���� ���� ���� Ž���ϴ� �˰���
		for(int loop=0 ; loop < n ; loop++) {
		
			if(inputArrInt[loop] < x) {				// ������ ��Ұ� x�� ���� Ŭ ��� ����
				
				System.out.print(inputArrInt[loop]);
				System.out.print(" ");
				
			}
		}

		
	}
} // Baek10871_smallNumber
