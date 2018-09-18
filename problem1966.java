package lumy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem1966 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < t; i++) {

			int N = sc.nextInt(); // 문서 총 갯수
			int M = sc.nextInt(); // 궁금한 문서 인덱스 번호
			ArrayList<Integer> list = new ArrayList<Integer>();
			Queue<Integer> que = new LinkedList<Integer>();

			for (int k = 0; k < N; k++) {

				int temp = sc.nextInt();
				que.offer(temp);
				list.add(temp);

			}

			int value_index_of_M = list.get(M);
			Collections.sort(list);
			Collections.reverse(list);
			//System.out.println(list);
			int number = 0;
			boolean end = false;
		A: for (int k = 0; k < list.size(); k++) {
			
				if(end)
					break;
			
				for (int n = 0; n < que.size(); n++) {

					if (list.get(k).equals(que.peek()) && list.get(k).equals(value_index_of_M) && M == 0) {
						number++;
						//System.out.println("첫 번째");
						//System.out.println(list.get(k) + " " + que.peek());
						//System.out.println(M + " " + n);
						end = true;
						continue A;
					}
					else if (list.get(k).equals(que.peek())) {
						que.poll();
						M = M -1;
						//System.out.print(" 변경 후: " + que.toString() + "   " + M + "\n");
						number++;
						break;
					} 
					else {
						if (value_index_of_M == que.peek() && M == 0) {
							M = que.size() - 1;
						}
						else{
							M = M -1;
						}
						//System.out.print("변경 전: " + que.toString());
						que.offer(que.poll());
						//System.out.print(" 변경 후: " + que.toString() + "   " + M + "\n");
					}

				}

			}
			
			result.add(number);

		}
		
		for(int i = 0; i<t; i++)
			System.out.println(result.get(i));

		sc.close();

	}

}
