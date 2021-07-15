package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14648_쿼리맛보기 {
	static long[] arr;
	public static void main(String[] args) throws Exception{
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());
		
		arr = new long[N+1];
		long[] ans = new long[q];
		st=  new StringTokenizer(br.readLine());
		for(int i = 1 ; i <= N ;i++)arr[i] = Integer.parseInt(st.nextToken());
		
		for(int t= 0 ; t < q; t++) {
			long answer = 0;
			st = new StringTokenizer(br.readLine());
			int comm = Integer.parseInt(st.nextToken());
			
			if(comm == 1) {
				long a = Integer.parseInt(st.nextToken());
				long b=  Integer.parseInt(st.nextToken());
				
				answer = q1(a, b);
			}else if(comm == 2) {
				long a = Integer.parseInt(st.nextToken());
				long b = Integer.parseInt(st.nextToken());
				long c = Integer.parseInt(st.nextToken());
				long d = Integer.parseInt(st.nextToken());
				answer = q2(a,b,c,d);
			}
			ans[t] = answer; 
		}
		for(long a : ans)System.out.println(a);
	}
	public static long q1(long a, long b) {
		long res = 0;
		for(long i = a; i <=b; i++) {
			res += arr[(int)i];
		}
		long tmp = arr[(int) a];
		arr[(int)a] = arr[(int)b];
		arr[(int)b] = tmp;
		return res;
	}
	public static long q2(long a, long b, long c, long d) {
		long res1 = 0;
		long res2 = 0;
		for(long i = a; i <= b; i++) {
			res1 += arr[(int)i];
		}
		for(long i = c; i <= d; i++) {
			res2 += arr[(int)i];
		}
		return res1 - res2;
	}
}
