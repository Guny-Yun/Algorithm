package Level3;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_섬연결하기 {

	public static void main(String[] args) {
		int n = 4; int[][] costs = {{},{},{},{},{}};
		
		System.out.println(solution(n, costs));
	}
	static int parents[];
    public static int find(int child){
        if(parents[child] == child) return child;
        else return parents[child] = find(parents[child]);
    }
    public static int solution(int n, int[][] costs) {
        int answer = 0;
        
        Arrays.sort(costs, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                Integer a = o1[2];
                Integer b = o2[2];
                return a.compareTo(b);
            }
        });
        parents = new int[n];
        for(int i = 0 ; i < n;i++){
            parents[i] = i;
        }
        for(int i = 0; i < costs.length;i++){
            int f_land = find(costs[i][0]);
            int s_land = find(costs[i][1]);
            
            if(f_land != s_land){
                parents[s_land] = f_land;
                answer += costs[i][2];
            }
        }
        
        return answer;
    }

}
