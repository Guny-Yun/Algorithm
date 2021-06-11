package BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_10162_전자레인지 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		if (t % 10 != 0) {
			bw.write("-1");
		} else {
			int[] timeBtn = { 300, 60, 10 };
			String cnt = "";
			for (int i = 0; i < timeBtn.length; i++) {
				cnt += t / timeBtn[i] + " ";
				t %= timeBtn[i];
			}

			bw.write(String.valueOf(cnt));
		}
		bw.flush();
	}
}
