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

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


// 스트림 학습 및 정리노트 작성 (노란색의 뒷장에 작성)

public class Beak4673_selfNumber{

	public static void main(String[] args) throws IOException{
		
		
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 10001;
		int sum = 0;
		int i,x;
		
		boolean[] SN = new boolean[n];
		
		
		for(i=1 ; i<n ; i++) {
			x = i;
			sum = i;
			
			while(x != 0) {
				sum = sum + (x % 10);
				x = x / 10;
			}
			
			if(sum <= 10000) {
				SN[sum] = true;
			}
		}
		
		i=1;
		
		while(i<=10000) {
			if(SN[i] != true) {
				bw.write(i+"\n");
			}
			i++;
		}
		bw.flush();		

	} // main() END
} // Beak4673_selfNumber END
