/*
 * �� �׷캰�� ����� �Ѵ� �л��� ������ �ݿø��Ͽ� ù°�ڸ����� ���
 * 
 * 1. �Է�
 * 	- [ok] �׷��� ���� countGroup, �׷캰 �л��� �� countStudent, �� �л��� ���� scoreStudent
 * 
 * 2. [ok] �׷��� ��� ���� ����
 *  
 * 3. �׷��� ����� �ʰ��ϴ� �л��� ����
 *  - [ok] ��� ���� �Ѵ� �л����� ���� �����ϰ� ��з��� ȯ��
 *  - [ok] �Ҽ��� ��° �ڸ����� ���
 *  
 * 4. �ټ��� �׷��� �Է¹ް� ���� 
 *  - [ok] 2�����迭 ���� �� �Է� (�� : �׷�, �� : �л�)
 * 
 * 5. Ʋ����..
 *  - QnA ���� ã�ƺ���
 *  - �ϴ� ���� ���ٹ���� Ʋ����.... �Ф�
 * 
 */




package step4;

import java.util.Scanner;

public class Beak4344_myAverage {
	public static void main(String[] args) {
		
		int group = 0;		// �׷��� ����
		int[] count;		// �׷캰 �л����� ��� (�迭)
		int[][] score; 		// �� �л����� ���� (2 ���� �迭)
		
		
		// �Ʒ��� �������� ���� �迭�� �ٲ���� (�� ���� �ʿ��ϱ� ������)
		int sum[];
		int average[];
		
		int highStudent[];		// ����� �ʰ��ϴ� �л��� ���
		double highRate[]; 		// ����� �ʰ��ϴ� �л��� ����
		double resultRate[];
		
		Scanner sc = new Scanner(System.in);
		
		
		// �Էº� //
		group = sc.nextInt();
		
		count = new int[group];
		score = new int[group][1000];	
		
		sum = new int[group];
		average = new int[group];
		highStudent = new int[group];		// ����� �ʰ��ϴ� �л��� ���
		highRate = new double[group]; 		// ����� �ʰ��ϴ� �л��� ����
		resultRate = new double[group];
		
		
		
		// �׷캰 �л� ���� ������ �Է¹޴� ����
		for(int line=0 ; line<group ; line++) {					// �� (=��)
			
			count[line] = sc.nextInt();
			
			for(int row=0 ; row<count[line] ; row++) {			// ��
				score[line][row] = sc.nextInt();
			}
		}


		
		for(int loop=0 ; loop<group ; loop++) {
			
			
			// group�� ����� ���� //
			for(int row=0 ; row<count[loop] ; row++) {
				sum[loop] += score[loop][row];
			}
			average[loop] = sum[loop] / count[loop]; 
			 	

			
			// ��հ� �ʰ��� �л� �� ���� //	
			for(int row=0 ; row<count[loop] ; row++) {
				
				if(average[loop] < score[loop][row]) {
					highStudent[loop] += 1;
				}
			}
			
			// ��հ��� �ʰ��ϴ� �л��� ���� // 
			// ��հ� �ʰ� �л� �� / �׷��� �л� �� * 100 
			highRate[loop] = (double)highStudent[loop] / (double)count[loop] * 100; 	// ������ ������ ���� ������ data type ��ȯ
			

			// �Ҽ��� ���� : �ݿø��Ͽ� 3�ڸ����� ��� // 
			highRate[loop] *= 1000;
			resultRate[loop] = (double)Math.round(highRate[loop]);		// �Ǽ� (double)�� �ݿø��Ͽ� ����(long)�� ��ȯ�ϴ� method
			resultRate[loop] /= 1000;		
			
		} // �׷� ���� �ݺ��� ����

		
		// ��� ���
		for(int loop=0 ; loop<group ; loop++) {			
			System.out.println(resultRate[loop]+"%");
		}
		
	} // main() END
} // Beak4344_myAverage END
