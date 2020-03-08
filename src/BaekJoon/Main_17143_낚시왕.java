package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
class Shark implements Comparable<Shark>{
	int r;int c;int s;int d;int z;
	public Shark(int r, int c, int s, int d, int z) {
		this.r = r;	this.c = c;	this.s = s;	this.d = d;	this.z = z;
	}
	@Override
	public int compareTo(Shark o) {
		if(this.r == o.r && this.c == o.c) {
			return Integer.compare(o.z,this.z);
		}
		if(this.r == o.r){
			return Integer.compare(this.c, o.c);
		}
		else {
			return Integer.compare(this.r, o.r);
		}
	}
}
public class Main_17143_낚시왕 {
	static int R,C,M, k;
	static ArrayList<Shark> sharks;
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int res = 0;
		if (M != 0) {
			sharks = new ArrayList<Shark>();
			for (int i = 0; i < M; i++) {
				st = new StringTokenizer(br.readLine(), " ");
				int r = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				int s = Integer.parseInt(st.nextToken());
				int d = Integer.parseInt(st.nextToken());
				int z = Integer.parseInt(st.nextToken());
				Shark shark = new Shark(r, c, s, d, z);
				sharks.add(shark);
			}
			// 입력끝
			for (int fisherPos = 1; fisherPos <= C; fisherPos++) {
				k = sharks.size();
				here: for (int j = 1; j <= R; j++) {// 행 위치
					for (int i = 0; i < k; i++) {// 현재 낚시왕의 열 C에서 i번째 상어의
						if (sharks.get(i).c == fisherPos && sharks.get(i).r == j) {// 상어와 낚시왕의 열 위치가 같고, 행을 쭉 검사
							res += sharks.get(i).z;
							sharks.remove(i);
							break here;// 찾았으면 현재 턴에서 낚시 끝
						}
					} // 현재 낚시왕 위치에서 가까운 상어 잡으면 break;
				} // 모든 상어 탐색
				if(sharks.isEmpty()) {
					break;
				}
				moveAll();// 이동 & 같은위치면 먹히기.
			} // 낚시왕의 이동 C에 다다르면 끝.
		}
		System.out.println(res);
	}//main end
	static void moveAll() {
		ArrayList<Shark> tmpsharks = new ArrayList<Shark>();
		k = sharks.size();
		for(int i = 0 ; i<k;i++) {
			//d가 1 = 상, 2 = 하, 3 = 우, 4 = 좌 
			int s = sharks.get(i).s;
			int nr = sharks.get(i).r;
			int nc = sharks.get(i).c;
			int dir = sharks.get(i).d;
			int z = sharks.get(i).z;
			switch(dir) {
			case 1://상
			case 2://하
				for(int m = 0; m< s;m++) {
					if(nr == 1)dir = 2;
					else if(nr == R) dir =1;
					if(dir ==1)nr -=1;
					else if(dir == 2)nr +=1;
				}
				break;
			case 3://우
			case 4://좌
				for(int m = 0 ; m<s;m++) {
					if(nc == 1)dir = 3;
					else if(nc == C)dir = 4;
					if(dir ==3)nc +=1;
					else if(dir == 4)nc -=1;
				}
				break;
			}
			Shark stmp = new Shark(nr,nc,s,dir,z);
			tmpsharks.add(stmp);
		}//상어 마리 수만큼 이동시키기 끝
		Collections.sort(tmpsharks);
		sharks.clear();
		int n = tmpsharks.size();
		int nr = tmpsharks.get(0).r;
		int nc = tmpsharks.get(0).c;
		sharks.add(tmpsharks.get(0));
		for(int i=1;i<n;i++) {
			if(nr == tmpsharks.get(i).r && nc ==tmpsharks.get(i).c)continue;
			nr = tmpsharks.get(i).r;
			nc = tmpsharks.get(i).c;
			sharks.add(tmpsharks.get(i));
		}
	}
}
