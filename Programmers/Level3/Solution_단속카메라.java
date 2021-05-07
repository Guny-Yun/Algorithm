package Level3;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_단속카메라 {

	public static void main(String[] args) {
		int[][] routes = {{},{},{},{}};
		System.out.println(solution(routes));
	}
	public static int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[1] - o2[1];
            }
        });
        
        int camera = Integer.MIN_VALUE;
        
        for(int[] route : routes){
            if(camera < route[0]){
                camera = route[1];
                answer++;
            }
        }
        return answer;
    }
}
