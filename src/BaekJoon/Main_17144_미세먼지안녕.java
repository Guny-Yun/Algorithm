package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main_17144_미세먼지안녕 {
    static int[][] map;
    public static void main(String[] args) throws Exception{
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        
        map = new int [R][C];
        
        int ridx1 = 0;
        int ridx2 = 0;
        for(int i = 0;i <R  ; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0 ; j<C;j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == -1) {
                    ridx2 = i;
                }
            }
        }
        ridx1 = ridx2-1;
        //상 우 하 좌
        for(int tc = 0;tc<T;tc++) {
            int[][] toom = new int[R][C];
            for(int r= 0; r<R;r++) {
                for(int c = 0; c<C;c++) {
                    if(map[r][c] != 0 && map[r][c] != -1) {
                        int cnt = 0;
                        for(int d = 0; d<4;d++) {
                            int nr = r + dr[d];
                            int nc = c+ dc[d];
                            if(0<=nr && nr<R && 0<=nc && nc<C && map[nr][nc]!=-1) {
                                cnt++;
                                toom[nr][nc] += map[r][c]/5;
                            }
                        }
                        map[r][c] -= (map[r][c]/5)*cnt;
                    }
                }
            }/////////
            for(int r = 0; r<R;r++) {
                for(int c = 0 ; c<C;c++) {
                    map[r][c] += toom[r][c];
                }
            }////////// 1단위시간 후 세팅 끝
            for(int i = ridx1;i>0;i--) {//상
                int ni = i-1;
                map[i][0] = map[ni][0];
            }
            for(int j = 0;j<C-1;j++) {//우로~
                int nj = j+1;
                map[0][j] = map[0][nj];
            }
            for(int i = 0;i<ridx1;i++) {//아래로~
                int ni = i+1;
                map[i][C-1] = map[ni][C-1];
            }
            for(int j = C-1;j>0;j--) {//좌로~
                int nj = j-1;
                map[ridx1][j] =map[ridx1][nj];
                
            }
            map[ridx1][1] = 0;//공기청정기 바로 옆 칸은 항상 0
            map[ridx1][0] = -1;
            /////////////////////////////////////// 위쪽 공기청정기 끝
            
            //아래쪽 공기청정기 시작. 하 우 상 좌
            for(int i = ridx2;i<R-1;i++) {//아래로~~
                int ni = i+1;
                map[i][0] = map[ni][0];
            }
            for(int j = 0;j<C-1;j++) {//우로~~
                int nj = j+1;
                map[R-1][j] = map[R-1][nj];
            }
            for(int i = R-1;i>ridx2;i--) {//위로~~
                int ni = i-1;
                map[i][C-1] = map[ni][C-1];
            }
            for(int j = C-1;j>0;j--) {//좌로~~
                int nj = j-1;
                map[ridx2][j] =map[ridx2][nj];
            }
            map[ridx2][1] = 0;
            map[ridx2][0] = -1;
        }//t초 후
        
        //더하기~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int sum = 2;
        for(int i = 0; i<R;i++) {
            for(int j = 0; j<C;j++) {
                sum += map[i][j];
            }
        }
        System.out.println(sum);
    }
}