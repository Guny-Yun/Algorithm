package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_D3_2817_부분수열의합 {
	static int N,K,cnt;
	static int[] numarr;
	
	static void dfs(int idx,int sum){
		if(sum == K) {
			cnt++;
			return;
		}
		if(sum > K || idx>=N)return;
		dfs(idx+1,sum+numarr[idx]);
		dfs(idx+1,sum);
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T; tc++) {
			String[] NK = br.readLine().split(" ");
			N = Integer.parseInt(NK[0]);
			K = Integer.parseInt(NK[1]);
			String[]arr = br.readLine().split(" ");
			numarr =  new int[N];
			for(int i = 0; i<N;i++) {
				numarr[i] = Integer.parseInt(arr[i]);
			}//입력끝
			cnt = 0;
			dfs(0,0);
			System.out.println("#" + tc + " " + cnt);	
		}
	}
}
