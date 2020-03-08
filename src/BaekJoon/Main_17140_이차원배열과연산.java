package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main_17140_이차원배열과연산 {
	static int[][] map;
	static Map<Integer,Integer> hash;
	static int[] cntarr;
	static PriorityQueue<int[]> pq;
	// ******************************************************
	public static void Rcal() {// 행연산
		for(int i = 0 ; i<100;i++) {
			cntarr = new int[101];
			pq = new PriorityQueue<>(new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					int res = Integer.compare(o1[1], o2[1]);
					if(res==0) res = Integer.compare(o1[0], o2[0]);
					return res;
				}
			});
			//
			for(int j = 0; j<100;j++) {
				if(map[i][j] != 0) {
					cntarr[map[i][j]]++;
				}
			}//한행 카운팅 끝
			for(int j = 0 ; j<101;j++) {
				if(cntarr[j]!=0) {
					pq.add(new int[] {j,cntarr[j]});
				}
			}// 카운트 된 (숫자 , 갯수) hashmap에 저장 
			for(int j = 0 ; j<100;j++) {
				map[i][j] = 0;
			}
			int n = pq.size();
			if(n > 50)n = 50;
			for(int j = 0 ; j<n; j++) {
				int[] tmp = pq.poll();
				map[i][j*2] = tmp[0];
				map[i][j*2+1] = tmp[1];
			}// 정렬하고 새로 한 행을 업데이트.
		}
	}
	// ******************************************************
	public static void Ccal() {// 행연산
		for(int j = 0 ; j<100;j++) {
			cntarr = new int[101];
			pq = new PriorityQueue<>(new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					int res = Integer.compare(o1[1], o2[1]);
					if(res==0) res = Integer.compare(o1[0], o2[0]);
					return res;
				}
			});
			for(int i = 0; i<100;i++) {
				if(map[i][j] != 0) {
					cntarr[map[i][j]]++;
				}
			}//한행 카운팅 끝
			for(int i = 0 ; i<101;i++) {
				if(cntarr[i]!=0) {
					pq.add(new int[] {i,cntarr[i]});
				}
			}// 카운트 된 (숫자 , 갯수) hashmap에 저장 
			for(int i = 0 ; i<100;i++) {
				map[i][j] = 0;
			}
			int n = pq.size();
			if(n > 50)n = 50;
			for(int i = 0 ; i<n;i++) {
				int[] tmp = pq.poll();
				map[i*2][j] = tmp[0];
				map[i*2+1][j] = tmp[1];
			}
			
		}
	}
	// ******************************************************
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int R = Integer.parseInt(st.nextToken()) -1;
		int C = Integer.parseInt(st.nextToken()) -1;
		int k = Integer.parseInt(st.nextToken());//
		map = new int[100][100];
		for(int i = 0 ; i<3;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 0;j<3;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}// 입력 끝
		int cnt = 0;
		while(true) {//무한loop
			// 종결조건ㅡㅡㅡㅡㅡㅡㅡ
			if(cnt>100) {
				cnt = -1;
				break;
			}
			if(map[R][C] == k)break;
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			cnt++;
			boolean flag = rcChk();
			if(flag) {
				Rcal();
			}else {
				Ccal();
			}// R or C연산
		}
		System.out.println(cnt);
	}
	// ******************************************************
	public static boolean rcChk() {// R연산인지 C연산인지 체크
		int maxr = 0;
		int maxc = 0;
		for (int j = 0; j < 100; j++) {
			int r = 0;
			for (int i = 0; i < 100; i++) {
				if (map[i][j] == 0)
					break;
				r++;
			}
			maxr = Math.max(r, maxr);
		}
		for (int i = 0; i < 100; i++) {
			int c = 0;
			for (int j = 0; j < 100; j++) {
				if (map[i][j] == 0)
					break;
				c++;
			}
			maxc = Math.max(c, maxc);
		}
		if(maxr>=maxc)return true; //true면 r연산
		else return false; // false면 c연산
	}
}