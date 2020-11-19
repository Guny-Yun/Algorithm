package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main_9375_패션왕신해빈 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < n;i++) {
			HashMap<String, Integer> map = new HashMap<>();
			int num = Integer.parseInt(br.readLine());
			for(int j = 0 ; j < num;j++) {
				String[] in = br.readLine().split(" ");
				
				if(map.containsKey(in[1])) {
					map.put(in[1], map.get(in[1]) + 1);
				}else {
					map.put(in[1], 1);
				}
			}
			int res = 1;
			for(int tmp : map.values()) {
				res *= tmp + 1;
			}
			System.out.println(res-1);
		}
	}
}
