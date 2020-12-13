package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_16953_AB {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int answer = 1;
		while(B != A) {
			if(B < A) {
				answer = -1;
				break;
			}
			String tmp = String.valueOf(B);
			if(tmp.charAt(tmp.length()-1) != '1' && B % 2 != 0) {
				answer = -1;
				break;
			}
			if(B % 2 == 0) {
				B >>= 1;
			}else {
				tmp = tmp.substring(0,tmp.length()-1);
				B = Integer.parseInt(tmp);
			}
			answer++;
		}
		System.out.println(answer);
		
	}

}
