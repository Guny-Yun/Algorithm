package Level2;

public class Solution_쿼드압축후개수세기 {
	static int[] answer;
	public static void main(String[] args) {
		int[][] arr = {};
		
		solution(arr);
		
	}
	
	public static int[] solution(int[][] arr) {
		answer = new int[2];
		div(0,0, arr.length, arr);
		return answer;
	}
	public static void div(int x, int y, int len, int [][] arr) {
		boolean z = true;
		boolean o = true;
		
		for(int i = x; i < x + len ; i++) {
			for(int j = y; j < y+ len; j++) {
				if(arr[i][j] == 1)z = false;
				if(arr[i][j] == 0)o = false;
			}
		}
		if(o) {
			answer[1]++;
			return;
		}
		if(z) {
			answer[0]++;
			return;
		}
		
		div(x,y,len/2,arr);
		div(x + len/2, y, len/2, arr);
		div(x, y+len/2, len/2,arr);
		div(x+len/2,y+len/2,len/2,arr);
	}
}
