/*
 * 셀프넘버의 그룹을 구하는 문제
 *  - 10000보다 작거나 같은 셀프넘버를 한 줄에 하나씩 출력
 *  
 * 0 조건
 *  - 양의정수 n
 *  - d(n) = n + n의 각 자리수의 합
 * 
 * 
 * 
 *    
 * */

package step5;

public class Beak4673_Customizing_selfNumber {

	public static void main(String[] args) {
     
		int count = 10001;		// 배열 인덱스 1-10000 사용 (0은 미사용)
		int sum = 0;
		int n = 0;				// 양의 정수
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