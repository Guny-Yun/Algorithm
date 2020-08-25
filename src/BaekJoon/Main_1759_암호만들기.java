package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1759_암호만들기 {
	static int L, C;
	static String[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = br.readLine().split(" ");
		Arrays.sort(arr);

		dfs("", 0);
	}

	public static void dfs(String pass, int v) {
		if (pass.length() == L) {
			if (check(pass))
				System.out.println(pass);
			return;
		}
		if (arr.length <= v)
			return;

		dfs(pass + arr[v], v + 1);
		dfs(pass, v + 1);
	}

	public static boolean check(String pass) {
		int ja = 0;
		int mo = 0;
		for (char tmp : pass.toCharArray()) {
			if (tmp == 'a' || tmp == 'e' || tmp == 'i' || tmp == 'o' || tmp == 'u') {
				mo++;
			} else {
				ja++;
			}
		}
		return ja >= 2 && mo >= 1;
	}

}
