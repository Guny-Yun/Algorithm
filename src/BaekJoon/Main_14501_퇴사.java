package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14501_퇴사 {
	
	static int N,res;
	static int[] reward, term;
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		reward = new int[N+1];
		term = new int[N+1];
		res =0;
		for(int i = 1 ; i<=N;i++) {
			st = new StringTokenizer(br.readLine()," ");
			term[i] = i+Integer.parseInt(st.nextToken())-1;
			reward[i] = Integer.parseInt(st.nextToken());
		}
		dfs(1,0,0);
		System.out.println(res);
		
	}
	public static void dfs(int start,int day, int money ) {
		res = Math.max(res, money);
		if(start > N)return;
		if(day < start  && term[start] <= N)dfs(start+1,term[start],money+reward[start]);
		dfs(start+1,day,money);
		
	}
}
