/*
 * 각 그룹별로 평균이 넘는 학생의 비율을 반올림하여 첫째자리까지 출력
 * 
 * 1. 입력
 * 	- [ok] 그룹의 갯수 countGroup, 그룹별 학생의 수 countStudent, 각 학생의 점수 scoreStudent
 * 
 * 2. [ok] 그룹의 평균 값을 연산
 *  
 * 3. 그룹중 평균을 초과하는 학생의 비율
 *  - [ok] 평균 값을 넘는 학생들의 수를 연산하고 백분률로 환산
 *  - [ok] 소수점 셋째 자리까지 출력
 *  
 * 4. 다수의 그룹을 입력받고 연산 
 *  - [ok] 2차원배열 생성 및 입력 (행 : 그룹, 열 : 학생)
 * 
 * 5. 틀렸음..
 *  - QnA 에서 찾아볼것
 *  - 일단 문제 접근방식이 틀린듯.... ㅠㅠ
 * 
 */




package step4;

import java.util.Scanner;

public class Beak4344_myAverage {
	public static void main(String[] args) {
		
		int group = 0;		// 그룹의 갯수
		int[] count;		// 그룹별 학생들의 명수 (배열)
		int[][] score; 		// 각 학생들의 점수 (2 차원 배열)
		
		
		// 아래의 변수들은 전부 배열로 바꿔야함 (행 별로 필요하기 때문임)
		int sum[];
		int average[];
		
		int highStudent[];		// 평균을 초과하는 학생의 명수
		double highRate[]; 		// 평균을 초과하는 학생의 비율
		double resultRate[];
		
		Scanner sc = new Scanner(System.in);
		
		
		// 입력부 //
		group = sc.nextInt();
		
		count = new int[group];
		score = new int[group][1000];	
		
		sum = new int[group];
		average = new int[group];
		highStudent = new int[group];		// 평균을 초과하는 학생의 명수
		highRate = new double[group]; 		// 평균을 초과하는 학생의 비율
		resultRate = new double[group];
		
		
		
		// 그룹별 학생 수와 점수를 입력받는 로직
		for(int line=0 ; line<group ; line++) {					// 행 (=줄)
			
			count[line] = sc.nextInt();
			
			for(int row=0 ; row<count[line] ; row++) {			// 열
				score[line][row] = sc.nextInt();
			}
		}


		
		for(int loop=0 ; loop<group ; loop++) {
			
			
			// group의 평균을 연산 //
			for(int row=0 ; row<count[loop] ; row++) {
				sum[loop] += score[loop][row];
			}
			average[loop] = sum[loop] / count[loop]; 
			 	

			
			// 평균값 초과의 학생 수 추출 //	
			for(int row=0 ; row<count[loop] ; row++) {
				
				if(average[loop] < score[loop][row]) {
					highStudent[loop] += 1;
				}
			}
			
			// 평균값을 초과하는 학생수 비율 // 
			// 평균값 초과 학생 수 / 그룹의 학생 수 * 100 
			highRate[loop] = (double)highStudent[loop] / (double)count[loop] * 100; 	// 나눗셈 연산을 위해 강제로 data type 변환
			

			// 소수점 제어 : 반올림하여 3자리까지 출력 // 
			highRate[loop] *= 1000;
			resultRate[loop] = (double)Math.round(highRate[loop]);		// 실수 (double)를 반올림하여 정수(long)로 반환하는 method
			resultRate[loop] /= 1000;		
			
		} // 그룹 단위 반복문 종료

		
		// 결과 출력
		for(int loop=0 ; loop<group ; loop++) {			
			System.out.println(resultRate[loop]+"%");
		}
		
	} // main() END
} // Beak4344_myAverage END
