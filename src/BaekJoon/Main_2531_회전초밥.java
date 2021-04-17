package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2531_회전초밥 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int[] visit = new int[d + 1];
		int[] dish = new int[N];

		for (int i = 0; i < N; i++) {
			dish[i] = Integer.parseInt(br.readLine());
		}

		int count = 0, max;
		 
        for (int i = 0; i < k; i++) {
            if (visit[ dish[i] ] == 0) count++; // 처음 먹어보는 종류의 초밥이라면 카운트 + 1
            visit[ dish[i] ]++;
        }
        max = count;
 
        for (int i = 1; i < N; i++) {
            if (max <= count) {
                if (visit[ c ] == 0) max = count + 1;
                else max = count;
            }
 
            visit[ dish[i - 1] ]--;
            if (visit[ dish[i - 1] ] == 0) count--;
 
            if (visit[ dish[(i + k - 1) % N]] == 0) count++;
            visit[ dish[(i + k - 1) % N]]++;
        }

		System.out.println(max);
	}
}
