/*
 * [����� ���]
 * 
 * 1. scanner instance�� �ٸ� type�� data�� �Է¹��� ��� ������ �����ؼ� ����� 
 *    = ������? 
 *    
 * 2. ��Ÿ�ӿ����� �߻��ϴ� ������??
 *  = ��û (�ι�° �Է°��� int ���� ������ �Ѿ?
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
	
		
		// ����ڿ��� �Է¹��� ���ڿ��� �ϳ��� �����Ͽ� ������ �ϴ� ����
		for (int loop=0 ; loop<number.length() ; loop++) {
			
			subStr = Integer.parseInt(number.substring(loop, loop+1));
			sum = sum + subStr;
		}
		
		System.out.println(sum);
		
		
		
	} // main END

}// NumberSum_11720 END
