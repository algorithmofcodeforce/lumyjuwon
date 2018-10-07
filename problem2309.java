package lumy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem2309 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int sum = 0;
		
		for(int i = 0 ; i<9; i++) {
			
			int tall = sc.nextInt();
			list.add(tall);
			sum += tall;
		}
		
		Collections.sort(list);
		
		for(int i = 0 ; i<list.size(); i++) {
			
			for(int k = i+1; k<list.size(); k++) {
				
				if(sum - list.get(i) - list.get(k) == 100) {
					
					for(int n = 0; n<list.size(); n++) {
						
						if(n == i || n == k)
							continue;
						else
							System.out.println(list.get(n));
						
					}
					
				}
				
			}
			
			
		}
		
		sc.close();
		
	}

}
