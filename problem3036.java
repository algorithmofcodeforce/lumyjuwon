package lumy;

import java.util.Scanner;

public class problem3036 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr_r = new int[N];

		for (int i = 0; i < N; i++) {

			arr_r[i] = sc.nextInt();

		}

		for (int i = 1; i < arr_r.length; i++) {

			int a = arr_r[0];
			int b = arr_r[i];

			if (a == b)
				System.out.println(1 + "/" + 1);
			else {

				if (a > b) {
					int a_ = a;
					int b_ = b;
					int c;

					while (true) {

						c = a_ % b_;
						if (c == 0)
							break;
						a_ = b_;
						b_ = c;

					}
					int gcd = b_;
					if (gcd == 1)
						System.out.println(a + "/" + b);
					else
						System.out.println(a / gcd + "/" + b / gcd);

				}

				if (a < b) {
					int a_ = b;
					int b_ = a;
					int c;

					while (true) {

						c = a_ % b_;
						if (c == 0)
							break;
						a_ = b_;
						b_ = c;

					}
					int gcd = b_;
					if (gcd == 1)
						System.out.println(a + "/" + b);
					else
						System.out.println(a / gcd + "/" + b / gcd);

				}

			}

		}

		sc.close();

	}

}
