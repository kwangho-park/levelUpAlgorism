
package step2;

import java.util.Scanner;

public class Baek2839_suger {
	public static void main(String[] args) {
		
		

		/*
		int n = 0;			// 3 <= n <= 5000 �Է°� ����
		int result = -1;
		int filter = 0;
		
		int max1;
		int max2;
		
		boolean flag = true; 
		
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		max1 = n / 5;
		max2 = n / 3;
		

		if(n%5 == 0) {	// 5�� ���
			result = n/5;
			flag = false;
		}else {			// 5�� ����� �ƴ� ���
			for(int loop=1 ; loop<max1+1 ; loop++) {
				
				filter = n - 5 * loop;
				
				if(filter%3 == 0) {
					result = loop + filter/3;		// 5kg ���� �� + 3kg ���� ��
					
					flag = false;				// ���⼭ �ּ� �������� ������ ������ ���������� �����ϸ� �ȵ�!!
				}
			}
		}
		
		
		if(flag) {
			if(n%3 ==0) { 	// 3�� ���
				result = n/3;
			}else {			// 3�� ����� �ƴ� ���
				for(int loop=1 ; loop<max2+1 ; loop++) {
					filter = n - 3 * loop;
					
					if(filter%5 == 0) {
						result = loop + filter/5;		// 3kg ���� �� + 5kg ���� ��
					}
				}
			}		
		}
		
		System.out.println(result);
		*/

		
		/* Ǯ�̿� ���� ���ذ� �ȵ� �ФФ� */ 
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
