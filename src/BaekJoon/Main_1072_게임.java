package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1072_게임 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long x = Long.parseLong(st.nextToken());
		long y = Long.parseLong(st.nextToken());
		long z = 100 * y / x;
		
		if(z >= 99) {
			System.out.println(-1);
		}else {
			long l = 0;
			long m = 0;
			long r = 1000000000;
			
			while(l <= r) {
				m = (l+r)/2;
				if(z < 100 * (y + m)/(x +m)) {
					r = m-1;
				}else l = m +1;
			}
			System.out.println(l);
		}
	}
}
