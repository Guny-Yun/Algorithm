package Level1;

import java.util.Stack;

public class Solution_크레인인형뽑기 {
	static int[][] board;
	static int[] moves;
	public static void main(String[] args) {
		int answer = 0;
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0 ; i < moves.length; i++) {
			for(int j = 0 ; j < board.length;j++) {
				if(board[j][moves[i]-1] != 0) {
					
					if(st.isEmpty())st.push(board[j][moves[i]-1]);
					else {
						if(st.peek() == board[j][moves[i]-1]) {
							st.pop();
							answer+=2;
						}
						else st.push(board[j][moves[i]-1]);
					}
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		System.out.println(answer);
	}

}
