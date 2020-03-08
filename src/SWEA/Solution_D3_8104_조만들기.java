package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_D3_8104_조만들기 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc= 1; tc<= T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int res =0;//세팅끝
			if(N%2 == 0) {
				res = N * (N*K+1)/2;
				System.out.print("#" + tc + " ");
				for(int i = 0;i<K;i++) {
					System.out.print(res+" ");
				}
				System.out.println();
			}
			else if(N%2 !=0) {
				res = (N-1)* ((N-1) * K + 1)/2;
				res += (N-1)*K + 1;
				System.out.print("#" + tc + " ");
				for(int i =0; i<K;i++) {
					System.out.print(res+" ");
					res++;
				}
				System.out.println();
			}
		}
	}
}
