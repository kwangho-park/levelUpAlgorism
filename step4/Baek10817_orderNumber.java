/*
 * 입력한 세 정수 a,b,c중에서 두번째로 큰 정수를 출력하는 프로그램
 * Arrays class의 정렬 알고리즘 sort() method 활용
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
		
		
		Arrays.sort(arrInt);		// Arrays class의 정렬 알고리즘 (정적 메소드)

		System.out.println(arrInt[1]);	
		
	}

}
