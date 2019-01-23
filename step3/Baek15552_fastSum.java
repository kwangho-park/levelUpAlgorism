/*
 * 빠른 A+B연산을 하는 프로그램
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
			// 문자(2B) 단위 입력 스트림
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
			// 문자(2B) 단위 출력 스트림
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			
			// 줄 갯수 입력
			int count = Integer.parseInt(br.readLine());
	
			// a + b 연산 결과를 저장하는 array
			int[] arrInt = new int[count];
			

			for(int loop=0;loop<count;loop++) {
				
				// 줄 단위 입력
				String inputStr = br.readLine();

				// 문자열을 문자단위로 제어 할 수는 참조변수 선언
				StringTokenizer st = new StringTokenizer(inputStr);
				
				
				int a = Integer.parseInt(st.nextToken());		// 문자 반환 (공백 기준)
				int b = Integer.parseInt(st.nextToken());
				
				// 연산한 결과값을 순차적으로 배열에 저장
				arrInt[loop] = a + b;
				
			}
			
			for(int loop=0;loop<count;loop++) {
				bw.write(arrInt[loop]+"\n");
			}
			// for문 종료 후 배열에 저장된 값을 bufferedWriter으로 출력

			bw.flush();
			bw.close();
			
		}catch(IOException e) {		// ButteredReader instance의 readLine method는 string 이외의값 입력 시 예외발생
			e.printStackTrace();
		}

		
	} // main() END

} //Baek15552_fastSum END
