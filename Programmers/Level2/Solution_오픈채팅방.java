package Level2;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution_오픈채팅방 {
	static String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
			"Change uid4567 Ryan" };

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		HashMap<String, String> hm = new HashMap<>();
		for (int i = 0; i < record.length; i++) {
			String[] in = record[i].split(" ");

			if (in[0].equals("Enter")) {
				list.add(in[1] + "님이 들어왔습니다.");
				hm.put(in[1], in[2]);
			} else if (in[0].equals("Change")) {
				hm.put(in[1], in[2]);
			} else {
				list.add(in[1] + "님이 나갔습니다.");
			}
		}
		String[] answer = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			int idx = list.get(i).indexOf("님");
			String id = list.get(i).substring(0, idx);
			String[] tmp = list.get(i).split(" ");
			answer[i] = hm.get(id) + "님이 " + tmp[1];
		}
		for(String s : answer) {
			System.out.println(s);
		}
	}

}
