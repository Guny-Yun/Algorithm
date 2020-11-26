package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_20166_문자열지옥에빠진호석 {
	static int di[] = {-1,-1,-1,0,1,1,1,0};
	static int dj[] = {-1,0,1,1,1,0,-1,-1};
	static char[][] map;
	static int N,M,K;
	static Trie tr;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new char[N+1][M+1];
		for(int i = 1; i <= N;i++) {
			String tmp = br.readLine();
			for(int j = 1; j <= M;j++) {
				map[i][j] = tmp.charAt(j-1);
			}
		}
		
		StringBuilder sb=  new StringBuilder();
		
		tr = new Trie();
		for(int i = 1; i <= N;i++) {
			for(int j = 1;j <= M;j++) {
				sb.append(map[i][j]);
				tr.insert(sb.toString());
				makeTr(i,j,sb,1);
				sb.setLength(0);
			}
		}
		//찾기
		for(int i = 0 ; i < K;i++) {
			String target = br.readLine();
			sb.append(tr.find(target) + "\n");
		}
		System.out.println(sb);
	}
	public static void makeTr(int i, int j, StringBuilder sb, int len) {
		if(len == 5) return;
		
		for(int k = 0 ; k < 8; k++) {
			int ni = (i + di[k])% N;
			int nj = (j + dj[k]) % M;
			if(ni <= 0) ni += N;
			if(nj <= 0) nj += M;
			
			sb.append(map[ni][nj]);
			tr.insert(sb.toString());
			makeTr(ni,nj, sb, len+1);
			sb.setLength(sb.length()-1);
		}
	}
	static class Node{
		HashMap<Character, Node> child;
		int cnt;
		Node(){
			child = new HashMap<>();
			cnt = 0;
		}
	}
	
	static class Trie{
		Node root;
		Trie(){
			root = new Node();
		}
		
		void insert(String s) {
			Node node = this.root;
			for(int i = 0 ; i < s.length();i++) {
				char tmp = s.charAt(i);
				if(!node.child.containsKey(tmp)) {
					node.child.put(tmp, new Node());
				}
				node = node.child.get(tmp);
			}
			node.cnt = node.cnt+1;
		}
		
		int find(String s) {
			Node node = this.root;
			for(int i = 0 ; i < s.length();i++) {
				char tmp = s.charAt(i);
				if(!node.child.containsKey(tmp))return 0;
				node = node.child.get(tmp);
			}
			return node.cnt;
		}
	}
}
