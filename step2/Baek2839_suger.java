
package step2;

import java.util.Scanner;

public class Baek2839_suger {
	public static void main(String[] args) {
		
		

		/*
		int n = 0;			// 3 <= n <= 5000 입력값 범위
		int result = -1;
		int filter = 0;
		
		int max1;
		int max2;
		
		boolean flag = true; 
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		max1 = n / 5;
		max2 = n / 3;
		

		if(n%5 == 0) {	// 5의 배수
			result = n/5;
			flag = false;
		}else {			// 5의 배수가 아닌 경우
			for(int loop=1 ; loop<max1+1 ; loop++) {
				
				filter = n - 5 * loop;
				
				if(filter%3 == 0) {
					result = loop + filter/3;		// 5kg 봉지 수 + 3kg 봉지 수
					
					flag = false;				// 여기서 최소 봉지수가 도출됬기 때문에 다음로직이 동작하면 안됨!!
				}
			}
		}
		
		
		if(flag) {
			if(n%3 ==0) { 	// 3의 배수
				result = n/3;
			}else {			// 3의 배수가 아닌 경우
				for(int loop=1 ; loop<max2+1 ; loop++) {
					filter = n - 3 * loop;
					
					if(filter%5 == 0) {
						result = loop + filter/5;		// 3kg 봉지 수 + 5kg 봉지 수
					}
				}
			}		
		}
		
		System.out.println(result);
		*/

		
		/* 풀이에 대한 이해가 안됨 ㅠㅠㅠ */ 
		int n, a, b;
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();

		int result = -1;
		
		for (a = 0; a * 5 <= n; a++)
			for (b = 0; a * 5 + b * 3 <= n; b++)
				if (a * 5 + b * 3 == n)
					result = a + b;	
				
			
		System.out.println(result);


		
	}
}
