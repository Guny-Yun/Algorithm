package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_17219_비밀번호찾기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String,String> map = new HashMap<String,String>();
		for(int i = 0 ; i < N ;i++) {
			String[] in = br.readLine().split(" ");
			map.put(in[0], in[1]); 
		}
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < M;i++) {
			String target = br.readLine();
			sb.append(map.get(target) + "\n");
		}
		System.out.println(sb);
	}
}
