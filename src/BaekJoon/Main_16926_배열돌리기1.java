package BaekJoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_16926_배열돌리기1 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int[][] map = new int[N][M];
		for(int i =0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}//입력끝
		int min = Math.min(M, N)/2;
		for(int t = 0;t<R;t++) {
			for(int k = 0;k<min;k++) {
				int tmp = map[k][k];
				for(int j = k+1;j<M-k;j++)map[k][j-1] = map[k][j];//우로~~
				for(int i = k+1;i<N-k;i++)map[i-1][M-k-1] = map[i][M-k-1];//아래로~
				for(int j = M-k-2;j>=k;j--)map[N-k-1][j+1] = map[N-k-1][j];
				for(int i = N-k-2;i> k;i--)map[i+1][k] =map[i][k];
				map[k+1][k] = tmp;
			}
		}//돌리기 
		for(int i = 0 ;i<N;i++) {
			for(int j = 0; j<M;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
