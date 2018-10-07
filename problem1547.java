package lumy;

import java.util.ArrayList;
import java.util.Scanner;

public class problem1547 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		ArrayList<Integer> cup = new ArrayList<Integer>();
		cup.add(1);
		cup.add(2);
		cup.add(3);
		
		for(int i = 0 ; i<M; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int temp = cup.indexOf(a);
			int temp2 = cup.indexOf(b);
			
			cup.set(temp, b);
			cup.set(temp2, a);
			
		}
		
		System.out.println(cup.get(0));
		
		sc.close();
		
	}

}
