package Exercise;

import java.util.LinkedList;
import java.util.Queue;

public class Main4 {
	static int[][] A = {{5,4,4},
			{4,3,4},
			{3,2,4},
			{2,2,2},
			{3,3,4},
			{1,4,4},
			{4,1,1}};
	public static void main(String[] args) {
		int answer = 0;
        int h = A.length;
        int w = A[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        boolean visit[][] = new boolean[h][w];
        int di[] = {-1,1,0,0};
        int dj[] = {0,0,-1,1};
        
        for(int i = 0 ; i < h; i++){
            for(int j = 0 ; j < w; j++){
                if(!visit[i][j]){
                    ++answer;
                    visit[i][j] = true;
                    int pivot = A[i][j];
                    q.add(new int[]{i,j});
                    while(!q.isEmpty()){
                        int[] tmp = q.poll();
                        for(int k = 0 ; k<4;k++){
                            int ni = tmp[0] + di[k];
                            int nj = tmp[1] + dj[k];
                            if(ni >=0 && nj >= 0 && ni < h && nj < w && !visit[ni][nj] && pivot == A[ni][nj]){
                                visit[ni][nj] = true;
                                q.add(new int[]{ni,nj});
                            }
                        }
                    }
                }
            }
        }
        System.out.println(answer);

	}

}
