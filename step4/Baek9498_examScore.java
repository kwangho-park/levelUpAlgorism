/**
 * ���� ������ �Է� �޾� A,B,C,D,F �� ����ϴ� ���α׷�
 */

package step4;

import java.util.Scanner;

public class Baek9498_examScore {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println("A");
		}else if(80<=score && score<90) {
			System.out.println("B");
		}else if(70<=score && score<80) {
			System.out.println("C");
		}else if(60<=score && score<70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
