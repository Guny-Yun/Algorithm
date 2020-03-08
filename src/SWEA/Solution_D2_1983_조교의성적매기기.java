package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_D2_1983_조교의성적매기기 {
	static final String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
			// {"D0","C-","C0","C+","B-","B0","B+","A-","A0","A+"};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1;tc<=T;tc++) {
			String[] input = br.readLine().split(" ");
			int N = Integer.parseInt(input[0]);
			int K = Integer.parseInt(input[1]);
			double[] tot = new double[N+1]; 
			for(int i=0;i<N;i++) {
				String[] input2 = br.readLine().split(" ");
				int m =Integer.parseInt(input2[0]);
				int f=Integer.parseInt(input2[1]);
				int a=Integer.parseInt(input2[2]);
				tot[i] = m*0.35 + f*0.45 + a*0.2;
			}
			double who = tot[K-1];
			Arrays.sort(tot);
			String res = null;
			for(int i = 1;i<tot.length;i++) {
				if(who == tot[i]) {
					res = grade[(N-i)*10/N];
					break;
				}
			}
			System.out.println("#" + tc + " " + res);
		}
	}
 }
