package Ebay;

public class Solution_1 {
	static int N = 2;
	static int[][] simulation_data = {{0,3},{2,5},{4,2},{5,3}};
	public static void main(String[] args) {
		int answer =0;
		int[] visit = new int[N];
		int idx = 0;
		int t =0;
		h:while(true) {
			for(int i = 0 ; i < N;i++) {
				if(visit[i] != 0) {
					visit[i]--;
				}
				if(visit[i] == 0) {
					if(simulation_data[idx][0] <= t) {
						visit[i] = simulation_data[idx][1];
						answer += t - simulation_data[idx++][0];
						if(idx == simulation_data.length) {
							break h;
						}
					}
				}
			}
			t++;
			
		}
		System.out.println(answer);
	}

}
