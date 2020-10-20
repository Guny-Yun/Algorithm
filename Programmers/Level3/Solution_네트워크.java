package Level3;

public class Solution_네트워크 {
	static int n = 3;
	static int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
	public static void main(String[] args) {
		int answer =0;
		boolean[] visit = new boolean[n];
		for(int i = 0; i < n;i++) {
			if(!visit[i]) {
				answer++;
				dfs(i, visit, computers);
			}
		}
		System.out.println(answer);
	}
	public static void dfs(int idx, boolean[] visit, int[][] computers) {
		visit[idx] = true;
		for(int i = 0 ; i < computers.length; i++) {
			if(!visit[i] && computers[idx][i] == 1) {
				dfs(i, visit, computers);
			}
		}
	}

}
