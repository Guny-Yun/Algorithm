package NHN;

import java.util.ArrayList;


public class Solution_1 {
	static int numOfAllPlayers = 17; //게임에 참여하는 사람의 수 
	static int numOfQuickPlayers = 5; // 달리기 빨라 술래 X
	static char[] namesOfQuickPlayers = {'B','D','I','M','P'}; // 술래 X 이름 
	static int numOfGames = 11; // 게임 수
	static int[] numOfMovesPerGame = {3,-4, 5, 6, -7, -8, 10,-12,-15, -20, 23}; // 게임별 이동 횟수
	public static void main(String[] args) {
		ArrayList<Info> list = new ArrayList<>();
		Info cur = new Info('A',0); // 술래
		cur.cnt++;
		char tmpname = 'B';
		int tmpcnt = 0;
		for(int i = 0 ; i < numOfAllPlayers - 1;i++) {
			list.add(new Info(tmpname, tmpcnt));
			tmpname++;
		}
		int idx = 0;
		
		for(int i = 0 ; i < numOfGames;i++) {// 게임횟수만큼
			int move = numOfMovesPerGame[i];
			if(move >= 0) {
				move %= numOfAllPlayers - 1;
			}else {
				move %= numOfAllPlayers - 1;
			}
			idx += move;
			if(idx < 0) idx = idx + numOfAllPlayers - 1;
			idx %= numOfAllPlayers - 1;
			if(!isCatch(list.get(idx), namesOfQuickPlayers)) {
				Info tmp2 = list.get(idx);
				list.set(idx, cur);
				cur = tmp2;
			}
			cur.cnt++;
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < list.size();i++) {
			sb.append(list.get(i).name + " " + list.get(i).cnt + "\n");
		}
		sb.append(cur.name + " " + cur.cnt);
		System.out.println(sb);
		
	}
	public static boolean isCatch(Info att, char[] namesOfQuickPlayers) {
		for(int i = 0 ; i < namesOfQuickPlayers.length;i++) {
			if(att.name == namesOfQuickPlayers[i]) return true;
		}
		return false;
	}
	static class Info{
		char name;
		int cnt;
		public Info(char name, int cnt) {
			this.cnt = cnt;
			this.name = name;
		}
	}

}
