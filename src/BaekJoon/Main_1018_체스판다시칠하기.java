package BaekJoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_1018_체스판다시칠하기 {
	static final String[]Bmap =
				{"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB"};
	static final String[]Wmap =
				{"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW",
				"WBWBWBWB",
				"BWBWBWBW"};
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] table = new char[N][M];
		List<Integer> cntlist =new ArrayList<>();
		for(int i = 0;i<N;i++) {
			String in = br.readLine();
			for(int j = 0; j<M;j++) {
				table[i][j] = in.charAt(j);
			}
		}
		for(int i =0;i<N-7;i++) {
			for(int j = 0; j<M-7;j++) {
				int wcnt = 0;
				int bcnt = 0;
				for(int m = i; m<i+8;m++) {
					for(int n = j;n<j+8;n++) {
						if(table[m][n] != Bmap[m-i].charAt(n-j))bcnt++;
						if(table[m][n] != Wmap[m-i].charAt(n-j))wcnt++;
					}
				}
				if(bcnt>wcnt) {
					cntlist.add(wcnt);
				}else cntlist.add(bcnt);
			}
		}
		System.out.println(Collections.min(cntlist));
	}
}
