

/* �ݺ����� �̿��� �������� ���*/

package step3;

import java.util.Scanner;

public class Baek2742_nPointChange {

	public static void main(String[] args) {
		
		int n;		// �Է°� : n <= 100,000
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		for(int loop = 0 ; n - loop > 0; loop++) {
			System.out.println(n-loop);
		}
	}

}
