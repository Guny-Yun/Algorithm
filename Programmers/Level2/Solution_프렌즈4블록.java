package Level2;

public class Solution_프렌즈4블록 {

	public static void main(String[] args) {
		int m = 4;
		int n = 5;
		String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
		System.out.println(solution(m, n, board));
	}
	public static int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] map = new char[m][n];
        for(int i = 0 ; i < m;i++){
            map[i] = board[i].toCharArray();
        }
        
        while(true){
            int cnt = chkBlock(m,n,map);
            if(cnt == 0)break;
            answer += cnt;
            drop(m, n, map);
        }
        
        return answer;
    }
    public static int chkBlock(int m, int n, char[][] map){
        int cnt = 0;
        boolean[][] visit = new boolean[m][n];
        for(int i = 0 ; i < m-1; i++){
            for(int j = 0 ; j < n -1; j++){
                if(map[i][j] == 'x') continue;
                
                findFour(map, visit, i, j);
            }
        }
        for(int i = 0 ; i < m; i++){
            for(int j = 0 ; j < n; j++){
                if(visit[i][j]){
                    cnt++;
                    map[i][j] = 'x';
                }
            }
        }
        return cnt;
    }
    public static void findFour(char[][] map, boolean[][] visit, int i, int j){
        char tmp = map[i][j];
        for(int r = i; r < i+2; r++){
            for(int c = j; c < j + 2; c++){
                if(map[r][c] != tmp)return;
            }
        }
        for(int r = i; r < i+2; r++){
            for(int c = j; c < j + 2; c++){
                visit[r][c] = true;
            }
        }
    }
    public static void drop(int m, int n, char[][]map){
        for(int j = 0 ; j < n ;j++){
            for(int i = m-1; i >= 0; i--){
                if(map[i][j] == 'x'){
                    for(int ni = i -1 ; ni >= 0; ni--){
                        if(map[ni][j] != 'x'){
                            map[i][j] = map[ni][j];
                            map[ni][j] = 'x';
                            break;
                        }
                    }
                }
            }
        }
    }

}
