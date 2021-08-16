package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_10814_나이순정렬 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] in = new String[N][2];
		for(int i = 0 ; i < N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			in[i][0] = st.nextToken();
			in[i][1] = st.nextToken();
		}
		
		Arrays.sort(in, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		});
		
		for(int i = 0 ; i < N;i++) {
			System.out.print(in[i][0] + " " + in[i][1] + "\n");
		}
	}
}
