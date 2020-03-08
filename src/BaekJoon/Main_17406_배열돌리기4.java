package BaekJoon;

import java.io.*;
import java.util.*;
public class Main_17406_배열돌리기4 {
    public static int N, M, K;
    public static int[][] A, info_rot;
    public static int[] order;
    public static Queue<int[]> all_order;
    public static void swap(int i, int j) {
        if(i==j) return;
        int tmp = order[i]; order[i] = order[j]; order[j] = tmp;
    }
    public static void perm(int i) {
        if(i==K) {
            int[] tmp = order.clone();
            all_order.offer(tmp);
            return;
        }
        for(int j = i; j < K; j++) {
            swap(i, j);
            perm(i+1);
            swap(i, j);
        }
    }
    public static int[][] move(int[][] new_A, int r, int c, int s) {
        int[][] res = new int[N][M];
        for(int i = 0; i < N; i++) res[i] = new_A[i].clone();
        
        for(int ss = 0; ss < s; ss++) {
            int st_y = r-s+ss, st_x = c-s+ss, ed_y = r+s-ss, ed_x = c+s-ss;
            
            for(int i = st_x+1; i <= ed_x; i++) res[st_y][i] = new_A[st_y][i-1]; // 우
            for(int i = st_y+1; i <= ed_y; i++) res[i][ed_x] = new_A[i-1][ed_x]; // 하
            for(int i = ed_x-1; i >= st_x; i--) res[ed_y][i] = new_A[ed_y][i+1]; // 좌
            for(int i = ed_y-1; i >= st_y; i--) res[i][st_x] = new_A[i+1][st_x]; // 상
        }
        return res;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) A[i][j] = Integer.parseInt(st.nextToken());
        }
        info_rot = new int[K][3]; // r, c, s
        order = new int[K];
        for(int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            info_rot[i][0] = Integer.parseInt(st.nextToken())-1;
            info_rot[i][1] = Integer.parseInt(st.nextToken())-1;
            info_rot[i][2] = Integer.parseInt(st.nextToken());
            order[i] = i;
        }
        // 회전 순서 정하기
        all_order = new LinkedList<int[]>();
        perm(0);
        // 회전하기
        int min = 100000;
        int sz = all_order.size();
        for(int i = 0; i < sz; i++) {
            int[] cur = all_order.poll();
            int[][] new_A = new int[N][M];
            for(int row = 0; row < N; row++) new_A[row] = A[row].clone();
            for(int j = 0; j < K; j++) {
                int[] cur_info_rot = info_rot[cur[j]]; // r, c, s
                int r = cur_info_rot[0], c = cur_info_rot[1], s = cur_info_rot[2];
                // 회전
                new_A = move(new_A, r, c, s);
            }
            // 배열 최소값
            for(int y = 0; y < N; y++) {
                int sum = 0;
                for(int x = 0; x < M; x++) sum += new_A[y][x];
                min = min>sum? sum:min;
            }
        }    
        System.out.println(min);
    }
}