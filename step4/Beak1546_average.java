// 점수를 조작해서 평균을 연산하는 로직


/*
* 1. 입력값
* 1. 최대값을 탐색
* 2. 모든 수를 수정 연산 ( s/m * 100)
* 3. 평균 연산
* */

package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Beak1546_average {
	public static void main(String[] args) {
	
		float average = 0.0f;
		float sum = 0.0f;
		float m = 0;						// 입력 수 중 최고 점수

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		// 과목의 갯수 입력받음
		
		
		float[] arrFloat = new float[n];	// 과목의 갯수 만큼 배열을 생성
		
		for(int loop=0;loop<n;loop++) {
			arrFloat[loop] = sc.nextFloat();		// 과목의 갯수만큼 입력을 받음
		}
		
		
		Arrays.sort(arrFloat);		// Arrays class의 정렬 알고리즘 (defult:오름차순 정렬)
		
		m = arrFloat[n-1];
		
		for(int loop=0;loop<n;loop++) {
			sum += arrFloat[loop] / m * 100;
		}
		
		average = sum / n;
		
		System.out.println(average);
		
	}
}
