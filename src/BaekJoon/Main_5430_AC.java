package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_5430_AC {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc<= T;tc++) {
			char[] func = br.readLine().toCharArray();
			int dcnt= 0;
			
			/* D 개수세기 */
			for(int i = 0 ; i < func.length;i++) {
				if(func[i] == 'D')dcnt++;
			}
			int N = Integer.parseInt(br.readLine()); // N입력
			
			/* 입력 파싱 */
			String in = br.readLine();
			in = in.substring(1,in.length()-1);
			StringTokenizer st = new StringTokenizer(in,",");
			
			/* D가 N보다 크거나 N이 0이면 error 띄우고 종료 */
			if(dcnt > N) {
				System.out.println("error");
				continue;
			}
			if(N == 0 || N == dcnt) {
				System.out.println("[]");
				continue;
			}
			
			/* q에 N개의 수 넣기 */
			Deque<Integer> q = new LinkedList<>();
			for(int i = 0 ; i < N;i++) {
				int tmp = Integer.parseInt(st.nextToken());
				q.add(tmp);
			}
			
			/* R D동작 실행 */
			boolean r = true;
			for(int i = 0 ; i < func.length;i++) {
				if(func[i] == 'R') {
					r = !r;
				}
				else if(func[i] == 'D') {
					if(r) {
						q.pollFirst();
					}else if(!r){
						q.pollLast();
					}
				}
			}
			
			/* 출력 */
			System.out.print("[");
			if(r) {
				while(true) {
					int tmp = q.pollFirst();
					System.out.print(tmp);
					if(q.isEmpty())break;
					System.out.print(",");
				}
			}
			else {
				while(true) {
					int tmp = q.pollLast();
					System.out.print(tmp);
					if(q.isEmpty())break;
					System.out.print(",");
				}
			}
			System.out.println("]");
		}
	}
}
