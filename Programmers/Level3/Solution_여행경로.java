package Level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_여행경로 {
	static String[][] tickets = { { "ICN", "JFK" }, { "HND", "IAD" }, { "JFK", "HND" } };

	static boolean[] visit;
	static List<String> list = new ArrayList<>();
	static String route = "";

	public static void main(String[] args) {
		String[] answer = {};

		for (int i = 0; i < tickets.length; i++) {
			visit = new boolean[tickets.length];
			String departure = tickets[i][0];
			String destination = tickets[i][1];
			if (departure.equals("ICN")) {
				visit[i] = true;
				route = departure + ",";
				dfs(tickets, destination, 1);
			}
		}
		Collections.sort(list);
		answer = list.get(0).split(",");

		for (String s : answer) {
			System.out.print(s + " ");
		}
	}

	public static void dfs(String[][] tickets, String end, int cnt) {
		route += end + ",";

		if (cnt == tickets.length) {
			list.add(route);
			return;
		}

		for (int i = 0; i < tickets.length; i++) {
			String dep = tickets[i][0];
			String dest = tickets[i][1];

			if (dep.equals(end) && !visit[i]) {
				visit[i] = true;
				dfs(tickets, dest, cnt + 1);
				visit[i] = false;
				route = route.substring(0, route.length() - 4);
			}
		}
	}
}
