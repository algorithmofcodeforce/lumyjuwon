package lumy;

import java.util.Scanner;

public class problem1094 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		String stick = Integer.toBinaryString(x);
		char[] stick_arr = stick.toCharArray();
		int count = 0;
		
		for(int i = 0 ; i<stick_arr.length; i++) {
			
			if(stick_arr[i] == '1')
				count += 1;
			
		}
		System.out.println(count);
		sc.close();

	}

}
