package BaekJoon;

import java.io.*;
import java.util.*;
public class Main_17471_게리맨더링 {
	static int N,mindiff,allpeople;
	static int[] sector,group;
	static int[][] conninfo;
	
	public static void bfs(){
		int chk = 0;// 그룹이 한쪽에만 쏠리지 않았나 체크하기 위함.
		int g1 = 0;
		for(int i = 0 ; i<N;i++) {
			chk+=group[i];
			if(group[i] == 0)g1+=sector[i];
		}// 첫번째 그룹, 0일떄의 그룹  합 백업
		if(chk == 0 || chk == 6)return;// 구역이 안나눠 질 경우 리턴. 000000 이거나 11111
		boolean[] visit = new boolean[N];
		Queue<Integer> que = new LinkedList<Integer>();
		int peoplesum = 0;
		for(int i =0;i<N;i++) {
			if(group[i] == 0) {
				peoplesum = sector[i];
				visit[i] =true;
				que.add(i);
				break;
			}
		}
		while(!que.isEmpty()) {
			int tmp = que.poll();
			if(conninfo[tmp].length != 0) {// 연결된 지역이 있다면
				int n = conninfo[tmp].length;
				for(int i = 0;i<n;i++) {
					if(group[tmp] == group[conninfo[tmp][i] -1] && !visit[conninfo[tmp][i] -1]) {
						peoplesum += sector[conninfo[tmp][i] -1];//0그룹에 연결되어 있다면 모두 더해줌
						visit[conninfo[tmp][i] -1] = true;
						que.add(conninfo[tmp][i] -1);
					}
				}
			}
		}
		if(g1 != peoplesum) {
			return;
		}// 0그룹의 합과,  연결되어있는 0그룹의 합이 다르면,  어딘가 연결이 되어있지 않다는 뜻, 그럼 리턴
		//다음 1그룹을 체크 하기 위한 처리
		que.clear();
		visit = new boolean[N];
		int g2 = 0;
		for(int i= 0;i<N;i++) {
			if(group[i] == 1) {
				g2+=sector[i];
			}
		}// 두번째 그룹의 합 백업
		int peoplesum2 = 0;
		for(int i= 0;i<N;i++) {
			if(group[i] == 1) {
				peoplesum2 = sector[i];
				visit[i] = true;
				que.add(i);
				break;
			}
		}//두번쨰그룹,,,0그룹이 아닌 1그룹 일때의 첫 원소를  큐에 넣으면서 bfs 시작 
		while(!que.isEmpty()) {
			int tmp = que.poll();
			if(conninfo[tmp].length != 0) {
				int n = conninfo[tmp].length;
				for(int i = 0;i<n;i++) {
					if(group[tmp] == group[conninfo[tmp][i] -1] && !visit[conninfo[tmp][i] -1]) {
						peoplesum2 += sector[conninfo[tmp][i] -1];
						visit[conninfo[tmp][i] -1] = true;
						que.add(conninfo[tmp][i] -1);
					}
				}
			}
		}
		if(g2 != peoplesum2) {
			return;
		}
		mindiff = Math.min(mindiff, Math.abs(peoplesum2 - peoplesum));
	}
	public static void dfs(int level) {
		if(level == N) {
			bfs();
			return;
		}
		for(int i = 0 ;i<2;i++) {
			group[level] = i;
			dfs(level+1);
		}
	}//구역을 완탐으로  2 선거구로 나눔 
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		sector = new int[N];
		conninfo = new int[N][];
		group = new int[N];
		allpeople = 0;
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0 ; i< N;i++) {
			sector[i] = Integer.parseInt(st.nextToken());
			allpeople += sector[i];
		}
		for(int i = 0 ;i<N;i++) {// N개의 구역
			st=  new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			conninfo[i] = new int[n]; 
			for(int k = 0 ; k<n;k++) { //연결정보
				conninfo[i][k] = Integer.parseInt(st.nextToken());
			}
		}// 입력끝
		mindiff = Integer.MAX_VALUE;
		dfs(0);
		if(mindiff == Integer.MAX_VALUE) {
			System.out.println(-1);//두 그룹 차이의 결과값이 바뀌지 않았다면 -1
		}else{
			System.out.println(mindiff);//두 그룹 차이의 최소값 출력
		}
	}

}
