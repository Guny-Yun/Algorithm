package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_1620_나는야포켓몬마스터이다솜 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> map = new HashMap<>();
		
		for(int i = 0 ; i < N;i++) {
			String num = (i+1) + "";
			String name = br.readLine();
			map.put(num, name);
			map.put(name, num);
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < M;i++) {
			String target = br.readLine();
			sb.append(map.get(target) + "\n");
		}
		System.out.println(sb);
	}
}
