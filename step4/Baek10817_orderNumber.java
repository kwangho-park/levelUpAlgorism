/*
 * �Է��� �� ���� a,b,c�߿��� �ι�°�� ū ������ ����ϴ� ���α׷�
 * Arrays class�� ���� �˰��� sort() method Ȱ��
 * 
 * */

package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Baek10817_orderNumber {
	public static void main(String[] args) {
		
		int[] arrInt = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		arrInt[0] = sc.nextInt();
		arrInt[1] = sc.nextInt();
		arrInt[2] = sc.nextInt();
		
		
		Arrays.sort(arrInt);		// Arrays class�� ���� �˰��� (���� �޼ҵ�)

		System.out.println(arrInt[1]);	
		
	}

}
