package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15649_N과M1 {
	static boolean[] visit;
	static int[] arr;
	static int[] res;
	static int N,M;
	public static void dfs(int r,int i) {
		 if(r==M) {
			 for(int k = 0 ; k<r;k++) {
				 System.out.print(res[k] + " ");
			 }
			 System.out.println();
			 return;
		 }
	     for(int j = 0; j < N; j++) { // permutation
	        if(!visit[j]) {
	           visit[j] = true;
	           res[r] = arr[j];
	           dfs(r+1, j+1);
	           visit[j] = false;
	        }
	     }
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		res = new int[N];
		visit = new boolean[N];
		for(int i = 0; i<N;i++) {
			arr[i] = i+1;
		}
		dfs(0,0);
	}
}
