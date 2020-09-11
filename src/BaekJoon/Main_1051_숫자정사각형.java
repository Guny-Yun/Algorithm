package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1051_숫자정사각형 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[N][M];
		for(int i = 0 ;  i < N;i++) {
			String in = br.readLine();
			for(int j = 0 ; j < M;j++) {
				map[i][j] = in.charAt(j)-'0';
			}
		}
		int max = 1;
		int len = 2;
		
		while(len <= M && len <=N) {
			for(int i=0; i+len-1<N; i++) {
                for(int j=0; j+len-1<M; j++) {
                    if(map[i][j]==map[i+len-1][j] && map[i+len-1][j]==map[i][j+len-1] && map[i][j+len-1]==map[i+len-1][j+len-1]) {
                        if(max<len)
                            max=len;
                    }
                }
            }
			len++;
		}
		System.out.println(max * max);
		
	}

}
