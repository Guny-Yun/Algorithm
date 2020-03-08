package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14500_테트로미노 {
	static int[][][] tetris =
		{
			{
				 {1,1,1,1}
				,{0,0,0,0}
			    ,{0,0,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {1,0,0,0}
				,{1,0,0,0}
				,{1,0,0,0}
				,{1,0,0,0}
			}
			,
			{
				 {1,1,0,0}
				,{1,1,0,0}
				,{0,0,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {1,0,0,0}
				,{1,0,0,0}
				,{1,1,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {0,1,0,0}
				,{0,1,0,0}
				,{1,1,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {1,1,1,0}
				,{0,0,1,0}
				,{0,0,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {1,0,0,0}
				,{1,1,1,0}
				,{0,0,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {0,0,1,0}
				,{1,1,1,0}
				,{0,0,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {1,1,1,0}
				,{1,0,0,0}
				,{0,0,0,0}
				,{0,0,0,0}
			},
			{
				 {1,1,0,0}
				,{0,1,0,0}
				,{0,1,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {1,1,0,0}
				,{1,0,0,0}
				,{1,0,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {0,1,0,0}
				,{1,1,0,0}
				,{1,0,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {1,0,0,0}
				,{1,1,0,0}
				,{0,1,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {1,1,0,0}
				,{0,1,1,0}
				,{0,0,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {0,1,1,0}
				,{1,1,0,0}
				,{0,0,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {1,0,0,0}
				,{1,1,0,0}
				,{1,0,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {0,1,0,0}
				,{1,1,0,0}
				,{0,1,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {0,1,0,0}
				,{1,1,1,0}
				,{0,0,0,0}
				,{0,0,0,0}
			}
			,
			{
				 {1,1,1,0}
				,{0,1,0,0}
				,{0,0,0,0}
				,{0,0,0,0}
			}
		};
	static int [][] map;
	static int N,M;
	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[503][503];
		
		for(int i = 0 ;i<N;i++) {
			st= new StringTokenizer(br.readLine()," ");
			for(int j = 0 ;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}// 입력 끝
		int maxres = 0;
		for(int i = 0 ; i<N;i++) {
			for(int j = 0;j<M;j++) {
				for(int k =0;k<19;k++) {
					int tmp = markdown(i,j,k);
					maxres = Math.max(tmp, maxres);
				}
			}
		}
		System.out.println(maxres);
	}
	public static int markdown(int i, int j, int chk) {
		int res = 0;
		for(int r=  0;r<4;r++) {
			for(int c = 0 ;c<4;c++) {
				res += tetris[chk][r][c] * map[i+r][j+c];
			}
		}
		return res;
	}

}
