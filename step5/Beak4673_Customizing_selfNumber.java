/*
 * �����ѹ��� �׷��� ���ϴ� ����
 *  - 10000���� �۰ų� ���� �����ѹ��� �� �ٿ� �ϳ��� ���
 *  
 * 0 ����
 *  - �������� n
 *  - d(n) = n + n�� �� �ڸ����� ��
 * 
 * 
 * 
 *    
 * */

package step5;

public class Beak4673_Customizing_selfNumber {

	public static void main(String[] args) {
     
		int count = 10001;		// �迭 �ε��� 1-10000 ��� (0�� �̻��)
		int sum = 0;
		int n = 0;				// ���� ����
		int x = 0;
		int test = 0;
		
		boolean[] SN = new boolean[count];
		
		
		for(n=1 ; n<count ; n++) {
			x = n;
			sum = n;
			
			
			while(x != 0) {
				sum = sum + (x % 10);
				test = x % 10;
				
				x = x / 10;
				
				
			}
			
			if(sum <= 10000) {
				SN[sum] = true;
			}
		}
		
		
		for(n=1 ; n<=1000 ; n++) {
			
			if(SN[n] != true) {
				System.out.println(n);
			}
		}
		
		
	} // main() END
} // Beak4673_Customizing_selfNumber END