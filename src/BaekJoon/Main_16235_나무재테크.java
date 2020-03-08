package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
class Tree implements Comparable<Tree>{
	int r;
	int c;
	int year;
	public Tree(int r, int c, int year) {
		this.r = r;
		this.c = c;
		this.year = year;
	}
	@Override
	public int compareTo(Tree o) {
		return Integer.compare(this.year, o.year);
	}
}
public class Main_16235_나무재테크 {
	static int N,M,K;
	static int[][] map;
	static int[] di = {-1,-1,-1,0,1,1,1,0};
	static int[] dj = {-1,0,1,1,1,0,-1,-1};
	static int[][] nutr;
	static PriorityQueue<Tree> pque;
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new int[N+1][N+1];
		for(int i = 1 ; i<N+1;i++) {
			for(int j = 1; j<N+1;j++) {
				map[i][j] = 5;
			}
		}
		// 초기 맵 세팅 모든 칸에 5
		nutr = new int[N+1][N+1];
		for(int i = 1;i<N+1;i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j = 1; j<N+1;j++) {
				nutr[i][j] = Integer.parseInt(st.nextToken());
			}
		}//양분 테이블 입력끝
		pque = new PriorityQueue<>();
		for(int i = 0 ; i<M;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int year = Integer.parseInt(st.nextToken());
			pque.offer(new Tree(r,c,year));
		}// 나무들 좌표와 나이 입력끝
	
		while(K>0) {// 1년의 시작.
			// 봄이예요...
			Queue<Tree> dietrees = new LinkedList<>();
			Queue<Tree> temptrees = new LinkedList<>();
			int pquecnt = pque.size();
			for(int i = 0; i<pquecnt;i++) {
				Tree temp = pque.poll();
				if(map[temp.r][temp.c]>=temp.year) {
					map[temp.r][temp.c]-=temp.year;
					temp.year += 1;
					temptrees.offer(temp);
				}
				else dietrees.offer(temp);
			}
			
			//여름
			int diecnt = dietrees.size();
			for(int i = 0; i<diecnt;i++) {
				Tree temp = dietrees.poll();
				int nu = temp.year/2;
				map[temp.r][temp.c] += nu; 
			}
			
			//가을
			int tempcnt = temptrees.size();
			for(int i = 0 ; i< tempcnt;i++) {
				Tree temp = temptrees.poll();
				if(temp.year % 5 == 0) {
					pque.offer(temp);
					for(int k = 0 ; k<8;k++) {
						int ni = temp.r + di[k];
						int nj = temp.c + dj[k];
						if(ni>0 && ni <=N && nj >0 && nj <=N) {
							pque.offer(new Tree(ni,nj,1));
						}
					}
				}else pque.offer(temp);
			}
			// 추운 겨울이예요...
			for(int i = 1;i<=N;i++) {
				for(int j = 1;j<=N;j++) {
					map[i][j] += nutr[i][j];
				}
			}
			K--;
		}
		System.out.println(pque.size());
	}
}
