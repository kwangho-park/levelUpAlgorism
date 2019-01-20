/*
 * 열 개씩 끊어 출력하기
 * 
 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 * 
 * 
 * */


package step3;

import java.util.Scanner;

public class Baek11721_printString {

	public static void main(String[] args) {
	
		String inputStr = "";
		
		char[] inputArr;
		
		Scanner sc = new Scanner(System.in);
		
		inputStr = sc.nextLine();
	
		inputArr = inputStr.toCharArray();
		
		for(int loop=0 ; loop<inputArr.length ; loop++) {
				
			int debug = (loop + 1) % 10;
			
			if((loop+1) % 10 == 0) {
				System.out.println();
			}else {
				System.out.print(inputArr[loop]);
			}
		}
	}
}
