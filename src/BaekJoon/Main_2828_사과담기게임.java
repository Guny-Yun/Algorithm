package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2828_사과담기게임 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N =Integer.parseInt(st.nextToken());
		int M =Integer.parseInt(st.nextToken());
		int J = Integer.parseInt(br.readLine());
		int start = 1;
		int end = M;
		int move = 0;
		
		for(int i = 0; i< J; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if(tmp >= start && tmp <= end)continue;
			
			if(tmp < start) {
				move += start - tmp;
				end -= start -tmp;
				start = tmp;
			}else if(tmp > end) {
				move += tmp - end;
				start += tmp - end;
				end = tmp;
			}
		}
		System.out.println(move);
	}
}
