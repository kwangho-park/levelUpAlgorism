// �Է��� ���� ����� ���ϴ� ���� (����� 70%)

package step6;

import java.util.Scanner;

public class Beak10039_average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] scoreArrInt = new int[5];
		int inputScore = 0;
		int sum = 0;
		int averageScore = 0;
	
		
		// �Էº� // 
		for(int loop=0 ; loop<5 ; loop++) {
		
			inputScore = sc.nextInt();
			
			if(inputScore<40) {
				scoreArrInt[loop] = 40;
			}else {
				scoreArrInt[loop] = inputScore;
			}
		}

		// ��տ���� ///
		for(int loop=0 ; loop<5 ; loop++) {
			
			sum = sum + scoreArrInt[loop];
		}
		averageScore = sum / 5;
		
		
		
		// ��º�//
		System.out.println(averageScore);
	}

}
