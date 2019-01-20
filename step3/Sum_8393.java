package step3;

import java.util.Scanner;

public class Sum_8393 {
	public static void main(String[] args) {
		int n = 0;
		int sum = 0;

		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();

		
		for(int loop=1 ; loop<=n ; loop++) {
			 sum +=loop;
		}
		
		System.out.println(sum);
	}

}
