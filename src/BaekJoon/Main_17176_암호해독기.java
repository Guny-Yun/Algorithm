package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_17176_암호해독기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cnt[] = new int[53];
		for (int i = 0; i < N; i++) {
			int t = Integer.parseInt(st.nextToken());
			cnt[t]++;
		}

		char[] ori = br.readLine().toCharArray();
		int[] tmp = new int[53];
		for (int i = 0; i < ori.length; i++) {
			if (ori[i] >= 'a' && ori[i] <= 'z') {
				tmp[ori[i] - 70]++;
			} else if (ori[i] == ' ')
				tmp[0]++;
			else if (ori[i] >= 'A' && ori[i] <= 'Z') {
				tmp[ori[i] - 64]++;
			}
		}
		boolean flag = true;
		for (int i = 0; i < 53; i++) {
			if (tmp[i] != cnt[i]) {
				flag = false;
				break;
			}
		}
		if(flag)System.out.println("y");
		else System.out.println("n");
	}
}
