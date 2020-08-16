package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_1652_누울자리를찾아라 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[][] map = new char[N][N];
		for(int i = 0 ; i < N;i++) {
			map[i] = br.readLine().toCharArray();
		}
		int ga = 0;
		int se = 0;
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
 		//가로
		for(int i = 0 ; i < N ;i++) {
			for(int j = 0 ; j < N;j++) {
				if(map[i][j] == '.') {
					st1.push(0);
					if(st1.size() == 2) {
						ga++;
						continue;
					}
				}
				else {
					st1.clear();
				}
			}
			st1.clear();
		}
		//세로
		for(int j = 0 ; j < N;j++) {
			for(int i = 0; i < N ;i++) {
				if(map[i][j] == '.') {
					st2.push(0);
					if(st2.size() == 2) {
						se++;
						continue;
					}
				}
				else {
					st2.clear();
				}
			}
			st2.clear();
		}
		System.out.println(ga + " " + se);
		
	}

}
