package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1058_친구 {
	static final int INF = 987654321;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N][N];
		int res = 0;
		for(int i = 0 ; i < N;i++) {
			char[] tmp = br.readLine().toCharArray();
			for(int j = 0 ; j < N;j++) {
				if(tmp[j] == 'Y') {
					map[i][j] = 1;
				}else
					map[i][j] = INF;
			}
		}// set end
		
		for(int k = 0 ; k < N;k++) {
			for(int i = 0 ; i < N ;i++) {
				for(int j = 0 ; j < N; j++) {
					if(i == j || j == k || k == i)continue;
					else if(map[i][j] > map[i][k] + map[k][j]) {
						map[i][j] = map[i][k] + map[k][j];
					}
				}
			}
		}
		for(int i = 0 ; i < N;i++) {
			int sum = 0;
			for(int j = 0 ; j < N;j++) {
				if(i == j)continue;
				else if(map[i][j] <= 2)sum++;
			}
			res = Math.max(res, sum);
		}
		System.out.println(res);
		
	}

}
