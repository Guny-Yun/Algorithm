package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2979_트럭주차 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] cnt = new int[101];
		for(int i = 0; i<3;i++) {
			st= new StringTokenizer(br.readLine()," ");
			int m = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			for(int k = m; k<n;k++) {
				cnt[k]++;
			}
		}
		int res = 0;
		for(int i = 1;i<101;i++) {
			if(cnt[i] == 1)res+=a*cnt[i];
			else if(cnt[i] == 2)res+=b*cnt[i];
			else if(cnt[i] == 3)res+=c*cnt[i];
		}
		System.out.println(res);
	}
}
