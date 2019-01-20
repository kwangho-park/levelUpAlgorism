

package step3;

import java.util.Scanner;

public class Baek1924_year2007 {
	public static void main(String[] args) {

		int x = 0;		// 월
		int y = 0;		// 일
	
		int stackDay = 0;		// 입력 x월 직전까지의 누적 일수
		int totalDay = 0;
		
		int week = 0;
		
		Scanner scan = new Scanner(System.in);

		x = scan.nextInt();	
		y = scan.nextInt();

		
		/* 누적 일수를 연산하는 로직 */
		for(int day=1 ; day<x ; day++) {
			if(day == 2) {
				stackDay += 28;		// result = result + 28 동일
				
			}else if((day==4)||(day==6)||(day==9)||(day==11)) {
				stackDay += 30;

			}else {
				stackDay += 31;
			}
		}
		
		/* 누적 일수 + 입력 월의 일수 = 총 일수 */
		totalDay = stackDay + y;
		
		/* 요일을 연산하는 로직 */
		
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
