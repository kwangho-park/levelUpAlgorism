// ������ �����ؼ� ����� �����ϴ� ����


/*
* 1. �Է°�
* 1. �ִ밪�� Ž��
* 2. ��� ���� ���� ���� ( s/m * 100)
* 3. ��� ����
* */

package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Beak1546_average {
	public static void main(String[] args) {
	
		float average = 0.0f;
		float sum = 0.0f;
		float m = 0;						// �Է� �� �� �ְ� ����

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// ������ ���� �Է¹���
		
		
		float[] arrFloat = new float[n];	// ������ ���� ��ŭ �迭�� ����
		
		for(int loop=0;loop<n;loop++) {
			arrFloat[loop] = sc.nextFloat();		// ������ ������ŭ �Է��� ����
		}
		
		
		Arrays.sort(arrFloat);		// Arrays class�� ���� �˰��� (defult:�������� ����)
		
		m = arrFloat[n-1];
		
		for(int loop=0;loop<n;loop++) {
			sum += arrFloat[loop] / m * 100;
		}
		
		average = sum / n;
		
		System.out.println(average);
		
	}
}
