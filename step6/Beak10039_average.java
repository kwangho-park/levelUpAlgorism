// 입력한 값의 평균을 구하는 로직 (정답률 70%)

package step6;

import java.util.Scanner;

public class Beak10039_average {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] scoreArrInt = new int[5];
		int inputScore = 0;
		int sum = 0;
		int averageScore = 0;
	
		
		// 입력부 // 
		for(int loop=0 ; loop<5 ; loop++) {
		
			inputScore = sc.nextInt();
			
			if(inputScore<40) {
				scoreArrInt[loop] = 40;
			}else {
				scoreArrInt[loop] = inputScore;
			}
		}

		// 평균연산부 ///
		for(int loop=0 ; loop<5 ; loop++) {
			
			sum = sum + scoreArrInt[loop];
		}
		averageScore = sum / 5;
		
		
		
		// 출력부//
		System.out.println(averageScore);
	}

}
