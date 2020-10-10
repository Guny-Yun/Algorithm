package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_11559_PuyoPuyo {
	static char[][] map = new char[12][6];
	static int[] di = {-1,1,0,0};
	static int[] dj = {0,0,-1,1};
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0;i <12;i++) {
			map[i] = br.readLine().toCharArray();
		}
		int cnt = 0;
		boolean can = true;
		
		while(can) {
			can = false;
			
			for(int i = 0 ; i < 12;i++) {
				for(int j = 0 ; j < 6;j++) {
					if(map[i][j] != '.') {
						ArrayList<int[]> list = bfs(i,j);
						
						if(list.size() >= 4) {
							for(int k = 0; k < list.size();k++) {
								int[] tmp = list.get(k);
								map[tmp[0]][tmp[1]] = '.';
							}
							can =true;
						}
					}
				}
			}
			if(can) {
				cnt++;
				fall();
			}
		}
		System.out.println(cnt);
		
	}
	public static ArrayList<int[]> bfs(int i, int j){
		ArrayList<int[]> list = new ArrayList<int[]>();
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {i,j});
		char pu = map[i][j];
		boolean[][] visit = new boolean[12][6];
		visit[i][j] = true;
		while(!q.isEmpty()) {
			int[] tmp = q.poll();
			list.add(tmp);
			for(int k = 0 ; k < 4;k++){
				int ni = tmp[0] + di[k];
				int nj = tmp[1] + dj[k];
				
				if(ni >= 0 && ni < 12 && nj >=0 && nj <6 && map[ni][nj] == pu && !visit[ni][nj]) {
					q.add(new int[] {ni,nj});
					visit[ni][nj] = true;
				}
			}
		}
		return list;
	}
	public static void fall() {
		Stack<Character> st = new Stack<>();
		for(int j = 0; j < 6;j++) {
			for(int i = 0 ;i < 12;i++) {
				if(map[i][j] != '.')st.push(map[i][j]);
			}
			for(int i = 11; i >=0;i-- ) {
				if(st.isEmpty())map[i][j] = '.';
				else map[i][j] = st.pop();
			}
		}
	}
}
