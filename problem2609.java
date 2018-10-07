package lumy;

import java.util.Scanner;

public class problem2609 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		int k = a*b;
		while(true) {
			
			c = a%b;
			if(c == 0)
				break;
			a = b;
			b = c;
			
		}
		
		System.out.println(b);
		System.out.println(k/b);
		
		sc.close();
		
		
	}

}
