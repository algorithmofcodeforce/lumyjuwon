package lumy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem11866 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		Queue<Integer> que = new LinkedList<Integer>();
		int[] arr = new int [N];
		
		for(int i = 1 ; i<=N; i++)
			que.offer(i);
		
		for(int i = 0; i<N; i++) {
			
			for(int k = 0 ; k<M; k++) {
				if(k == M-1)
					arr[i] = que.poll();
				else
					que.offer(que.poll());
			}
			//System.out.println(que);
			
		}
		
		String result = "<";
		for(int i = 0 ; i<arr.length; i++) {
			if(i != arr.length-1)
				result = result + Integer.valueOf(arr[i]).toString() + ", ";
			else
				result = result + Integer.valueOf(arr[i]).toString();
		}
		result = result + ">";
		System.out.println(result);
		
		
		
		
		sc.close();

	}

}
