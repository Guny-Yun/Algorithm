package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_4386_별자리만들기 {
	static int parents[];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		parents = new int[N];
		
		double star[][] = new double[N][2];
		double answer = 0.0;
		
		StringTokenizer st;
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			star[i][0] = Double.parseDouble(st.nextToken());
			star[i][1] = Double.parseDouble(st.nextToken());
		}
		
		int e = N * (N-1)/ 2;
		double edges[][] = new double[e][3];
		for(int i = 0 ; i < e ; i++) {
			for(int m = 0; m < N; m++) {
				for(int n = m+1; n < N; n++, i++) {
					edges[i][0] = m;
					edges[i][1] = n;
					edges[i][2] = Math.sqrt(Math.pow(star[m][0]-star[n][0], 2) + Math.pow(star[m][1] - star[n][1], 2));
				}
			}
		}
		
		Arrays.sort(edges, new Comparator<double[]>() {

			@Override
			public int compare(double[] o1, double[] o2) {
				return Double.compare(o1[2], o2[2]);
			}
			
		});
		for(int i = 0 ; i < N;i++)make(i);
		
		int cnt = 0;
		for(int i = 0; i < e;i++) {
			int a= find((int)edges[i][0]);
			int b= find((int)edges[i][1]);
			
			if(a == b)continue;
			
			union(a,b);
			
			answer += edges[i][2];
			cnt++;
			if(cnt == N - 1)break;
		}
		System.out.printf("%.2f", answer);
	}
	public static void make(int x) {
		parents[x] = x;
	}
	public static int find(int x) {
		if( x == parents[x])return x;
		return parents[x] = find(parents[x]);
	}
	
	public static void union(int x, int y) {
		int px = find(x);
		int py = find(y);
		
		if(px != py)parents[py] = px;
	}
}
