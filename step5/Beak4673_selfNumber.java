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

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


// ��Ʈ�� �н� �� ������Ʈ �ۼ� (������� ���忡 �ۼ�)

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
