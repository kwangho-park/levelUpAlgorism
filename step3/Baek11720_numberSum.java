/*
 * [장기적 고민]
 * 
 * 1. scanner instance는 다른 type의 data를 입력받을 경우 별도로 생성해서 사용함 
 *    = 이유는? 
 *    
 * 2. 런타임에러가 발생하는 이유는??
 *  = 추청 (두번째 입력값이 int 형의 범위를 넘어감?
 * 
 * 
 * */

package step3;

import java.util.Scanner;

public class Baek11720_numberSum {

	public static void main(String[] args) {
		
		
		int N = 0;
		int subStr = 0;
		int sum = 0;
		
		String number = "";
		
		Scanner scInt = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		
		N = scInt.nextInt();	
		number = scStr.nextLine();
	
		
		// 사용자에게 입력받은 문자열을 하나씩 분할하여 덧셈을 하는 로직
		for (int loop=0 ; loop<number.length() ; loop++) {
			
			subStr = Integer.parseInt(number.substring(loop, loop+1));
			sum = sum + subStr;
		}
		
		System.out.println(sum);
		
		
		
	} // main END

}// NumberSum_11720 END
