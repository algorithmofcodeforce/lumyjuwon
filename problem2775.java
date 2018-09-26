package lumy;

import java.util.Scanner;

public class problem2775 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];

		for (int i = 0; i < T; i++) {

			int k = sc.nextInt();
			int n = sc.nextInt();

			int[] dp = new int[(k + 1) * n + 1];
			for (int m = 1; m <= n; m++)
				dp[m] = m;

			for (int m = 1; m <= k; m++) {

				for (int z = 1; z <= n; z++) {
					if(z == 1)
						dp[m*n +z] = 1;
					else {
						dp[m*n +z] = dp[m*n + z-1] + dp[m*n + z - n];
					}
				}

			}

			arr[i] = dp[(k + 1) * n];

		}
		for(int i = 0; i<arr.length; i++)
			System.out.println(arr[i]);
		sc.close();

	}

}
