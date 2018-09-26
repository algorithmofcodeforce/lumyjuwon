package lumy;

import java.util.Scanner;

public class problem1024 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int sigma_start = 0;
		int sigma_end = 0;

		for (int i = L; i <= 100; i++) {
			int k_coefficient = (i - 1) * 2 + 2;
			int constant = (int) Math.pow(i - 1, 2) + (i - 1);
			int Transform_N = N * 2 - constant;
			//System.out.println(k_coefficient+"k" + "+ " + constant + " = " + Transform_N);
			
			if(Transform_N <0)
				break;
				
			if (Transform_N % k_coefficient == 0) {
				// System.out.println("L: " + i);
				sigma_start = Transform_N / k_coefficient;
				sigma_end = sigma_start + (i - 1);
				// System.out.println("K: " + start);
				break;
			}

		}

		if (sigma_start == 0 && sigma_end == 0) {
			System.out.println(-1);
		}
		else {
			for (int i = sigma_start; i <= sigma_end; i++) {
				if (i == sigma_end) {
					System.out.print(i);
				} else {
					System.out.print(i + " ");
				}
			}
		}

		sc.close();

	}

}
