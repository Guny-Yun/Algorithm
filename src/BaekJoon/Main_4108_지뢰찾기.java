package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4108_지뢰찾기 {
	static int[] di = {0,1,0,-1,1,-1,1,-1};
	static int[] dj = {1,0,-1,0,1,-1,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true){
			st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			if(R == 0 && C == 0)break;
			
			char[][] map = new char[R][C];
			for(int i = 0 ; i<R;i++) {
				map[i] = br.readLine().toCharArray();
			}
			for(int i = 0 ; i < R; i++) {
				for(int j = 0 ; j< C;j++) {
					if(map[i][j] == '*')System.out.print(map[i][j]);
					else{
						System.out.print(find(map,i,j));
					}
				}
				System.out.println();
			}
		}
	}
	public static int find(char[][] map, int i , int j) {
		int cnt = 0;
		for(int k = 0; k<8;k++) {
			int ni = i+ di[k];
			int nj = j + dj[k];
			
			if(ni < 0 || nj < 0 || ni >=map.length || nj >= map[0].length)continue;
			
			if(map[ni][nj] == '*')cnt++;

		}
		return cnt;
	}
}
