package lumy;

import java.util.Scanner;

public class problem13241 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long sum = A * B;
		
		while(A%B != 0) {
			long temp = B;
			B = A%B;
			A = temp;
		}
		
		long G = B;
		
		System.out.println(sum/G);
		
		sc.close();

	}

}
