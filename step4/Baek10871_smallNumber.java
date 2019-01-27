/*
 * 수열 a와 정수값 x를 입력받아 수열의 요소중 x보다 작은수를 입력받은 순서대로 출력 
 */
package step4;


import java.util.Scanner;

public class Baek10871_smallNumber {

	public static void main(String[] args) {
		
		int n = 0;		// 수열 요소의 갯수 (길이)
		int x = 0;		// 비교 값

		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		x = sc.nextInt();
		
		
		int[] inputArrInt = new int[n];		// 수열을 입력받기 위한 배열

		
		// 수열의 요소를 입력받기위한 반복문
		for(int loop=0 ; loop < n ; loop++) {
			inputArrInt[loop] = sc.nextInt();
		}


		// 수열의 요소 중 x값 보다 작은 수를 탐색하는 알고리즘
		for(int loop=0 ; loop < n ; loop++) {
		
			if(inputArrInt[loop] < x) {				// 수열의 요소가 x값 보다 클 경우 실행
				
				System.out.print(inputArrInt[loop]);
				System.out.print(" ");
				
			}
		}

		
	}
} // Baek10871_smallNumber
