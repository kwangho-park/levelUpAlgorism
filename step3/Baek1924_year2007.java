

package step3;

import java.util.Scanner;

public class Baek1924_year2007 {
	public static void main(String[] args) {

		int x = 0;		// ��
		int y = 0;		// ��
	
		int stackDay = 0;		// �Է� x�� ���������� ���� �ϼ�
		int totalDay = 0;
		
		int week = 0;
		
		Scanner scan = new Scanner(System.in);

		x = scan.nextInt();	
		y = scan.nextInt();

		
		/* ���� �ϼ��� �����ϴ� ���� */
		for(int day=1 ; day<x ; day++) {
			if(day == 2) {
				stackDay += 28;		// result = result + 28 ����
				
			}else if((day==4)||(day==6)||(day==9)||(day==11)) {
				stackDay += 30;

			}else {
				stackDay += 31;
			}
		}
		
		/* ���� �ϼ� + �Է� ���� �ϼ� = �� �ϼ� */
		totalDay = stackDay + y;
		
		/* ������ �����ϴ� ���� */
		
		week = totalDay % 7;
		
		switch(week) {
		case 0 : 
			System.out.print("SUN");
			break;
		case 1 : 
			System.out.print("MON");
			break;			
		case 2 : 
			System.out.print("TUE");
			break;
		case 3 : 
			System.out.print("WED");
			break;
		case 4 : 
			System.out.print("THU");
			break;
		case 5 : 
			System.out.print("FRI");
			break;
		case 6 : 
			System.out.print("SAT");
			break;
		}
		
	}
}
