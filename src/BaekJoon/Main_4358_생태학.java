package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main_4358_생태학 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> hm = new HashMap<>();
		String in = br.readLine();
		int cnt = 0;
		while(true) {
			hm.put(in, hm.getOrDefault(in, 0) +1);
			cnt++;
			
			in = br.readLine();
			if(in == null || in.length() == 0)break;
		}
		
		Object[] keys = hm.keySet().toArray();
		Arrays.sort(keys);
		
		StringBuilder sb = new StringBuilder();
		for(Object key : keys) {
			String tmp = (String) key;
			int count = hm.get(key);
			double p = (double)(count * 100.0) / cnt;
			
			sb.append(key + " " + String.format("%.4f", p) + "\n");
		}
		System.out.println(sb.toString());
	}

}
