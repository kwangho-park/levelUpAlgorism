/*
 * �� ���� ���� ����ϱ�
 * 
 * ���ĺ� �ҹ��ڿ� �빮�ڷθ� �̷���� ���̰� N�� �ܾ �־�����.
 * �� �ٿ� 10���ھ� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
