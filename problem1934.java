package lumy;

import java.util.Scanner;

public class problem1934 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {

			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A * B;
			int G = 0;

			while (true) {

				if (A % B != 0) {
					int temp = B;

					B = A % B;
					A = temp;
				} else {
					G = B;
					break;
				}
			}

			arr[i] = sum / G;

		}

		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		sc.close();

	}

}
