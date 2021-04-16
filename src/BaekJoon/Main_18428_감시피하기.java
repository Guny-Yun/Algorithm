package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_18428_감시피하기 {
	static char[][] map;
	static int N;
	static boolean detect, answer;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new char[N][N];
		for(int i = 0; i < N;i++) {
			String[] in = br.readLine().split(" ");
			for(int j = 0 ; j < N; j++) {
				map[i][j] = in[j].charAt(0);
			}
		}
		make_o(0);
		
		if(answer)System.out.println("YES");
		else System.out.println("NO");
	}
	public static void make_o(int wall) {
		if(wall == 3) {
			chk();
			if(!detect) {
				answer = true;
			}
			return;
		}
		for(int i = 0 ; i < N;i++) {
			for(int j = 0 ; j < N;j++) {
				if(map[i][j] == 'X') {
					map[i][j] = 'O';
					make_o(wall+1);
					map[i][j] = 'X';
				}
			}
		}
	}
	
	public static void chk() {
		for(int i = 0; i < N;i++) {
			for(int j = 0 ; j < N;j++) {
				if(map[i][j] == 'T') {
					for(int ii = i; ii >= 0; ii--) {
						if(map[ii][j] == 'S') {
							detect = true;
							return;
						}else if(map[ii][j] == 'O') {
							break;
						}
					}
					for(int ii = i; ii < N; ii++) {
						if(map[ii][j] == 'S') {
							detect = true;
							return;
						}else if(map[ii][j] == 'O') {
							break;
						}
					}for(int jj = j; jj < N; jj++) {
						if(map[i][jj] == 'S') {
							detect = true;
							return;
						}else if(map[i][jj] == 'O')break;
					}for(int jj = j; jj >= 0; jj--) {
						if(map[i][jj] == 'S') {
							detect = true;
							return;
						}else if(map[i][jj] == 'O')break;
					}
					detect = false;
				}
			}
		}
	}
}
