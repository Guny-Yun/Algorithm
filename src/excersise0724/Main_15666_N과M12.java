package excersise0724;

import java.io.*;
import java.util.*;

public class Main_15666_N과M12 {
	static int N, M, res[];
	static StringBuilder sb = new StringBuilder();
	static Set<Integer> ts = new TreeSet<Integer>();
	static int[] num = new int[10001];
	static ArrayList<Integer> list;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		res = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			ts.add(tmp);
			num[tmp]++;
		}
		list = new ArrayList<>(ts);

		dfs(0, list.get(0));
		bw.flush();
		bw.close();
	}

	public static void dfs(int v, int start) throws IOException {
		if (v == M) {
			for (int i = 0; i < v; i++) {
				bw.write(res[i] + " ");
			}
			bw.write("\n");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			if(start <= list.get(i)) {
				res[v] = list.get(i);
				dfs(v + 1, list.get(i));
			}
		}
	}
}
