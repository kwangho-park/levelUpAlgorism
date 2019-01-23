/*
 * ���� A+B������ �ϴ� ���α׷�
 * */

package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Baek15552_fastSum{
	public static void main(String[] args) {

		try {
			// ����(2B) ���� �Է� ��Ʈ��
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
			// ����(2B) ���� ��� ��Ʈ��
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			
			// �� ���� �Է�
			int count = Integer.parseInt(br.readLine());
	
			// a + b ���� ����� �����ϴ� array
			int[] arrInt = new int[count];
			

			for(int loop=0;loop<count;loop++) {
				
				// �� ���� �Է�
				String inputStr = br.readLine();

				// ���ڿ��� ���ڴ����� ���� �� ���� �������� ����
				StringTokenizer st = new StringTokenizer(inputStr);
				
				
				int a = Integer.parseInt(st.nextToken());		// ���� ��ȯ (���� ����)
				int b = Integer.parseInt(st.nextToken());
				
				// ������ ������� ���������� �迭�� ����
				arrInt[loop] = a + b;
				
			}
			
			for(int loop=0;loop<count;loop++) {
				bw.write(arrInt[loop]+"\n");
			}
			// for�� ���� �� �迭�� ����� ���� bufferedWriter���� ���

			bw.flush();
			bw.close();
			
		}catch(IOException e) {		// ButteredReader instance�� readLine method�� string �̿��ǰ� �Է� �� ���ܹ߻�
			e.printStackTrace();
		}

		
	} // main() END

} //Baek15552_fastSum END
