package Level2;

public class Solution_단체사진찍기 {
	static boolean visit[] = new boolean[8];
	static char[] friends = { 'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T' };
	static int answer;

	public static void main(String[] args) {
		int n = 2;
		String[] data = { "N~F=0", "R~T>2" };

		solution(n, data);
	}

	public static int solution(int n, String[] data) {
		answer = 0;
		StringBuilder sb = new StringBuilder();

		dfs(0, sb, data);
		return answer;
	}

	public static void dfs(int idx, StringBuilder sb, String[] data) {
		if (idx == 8) {
			if (isPossible(sb, data))
				answer++;

			return;
		}
		for (int i = 0; i < 8; i++) {
			if (visit[i])
				continue;

			visit[i] = true;
			sb.append(String.valueOf(friends[i]));
			dfs(idx + 1, sb, data);
			visit[i] = false;
			sb.delete(idx, 8);
		}
	}

	public static boolean isPossible(StringBuilder sb, String[] data) {
		for (int i = 0; i < data.length; i++) {
			int gap = Math.abs(
					sb.indexOf(String.valueOf(data[i].charAt(0))) - sb.indexOf(String.valueOf(data[i].charAt(2)))) - 1;

			int condi_gap = data[i].charAt(4) - '0';

			switch (data[i].charAt(3)) {
			case '=':
				if (gap != condi_gap)
					return false;
				break;
			case '>':
				if (gap <= condi_gap)
					return false;
				break;
			case '<':
				if (gap >= condi_gap)
					return false;
				break;
			}
		}
		return true;
	}
}
