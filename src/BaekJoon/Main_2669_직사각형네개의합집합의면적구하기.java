package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2669_직사각형네개의합집합의면적구하기 {

	public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        boolean[][] map = new boolean[101][101];
        for(int k = 0; k<4;k++) {
        	st = new StringTokenizer(br.readLine());
        	int x1 = Integer.parseInt(st.nextToken());
        	int y1 = Integer.parseInt(st.nextToken());
        	int x2 = Integer.parseInt(st.nextToken());
        	int y2 = Integer.parseInt(st.nextToken());
        	for(int i = x1;i<x2;i++) {
        		for(int j = y1;j<y2;j++) {
        			map[i][j] = true;
        		}
        	}
        }
        int cnt = 0;
        for(int i = 0;i<101;i++){
        	for(int j = 0 ; j<101;j++){
        		if(map[i][j])cnt++;
        	}
        }
        System.out.println(cnt);
	}

}
