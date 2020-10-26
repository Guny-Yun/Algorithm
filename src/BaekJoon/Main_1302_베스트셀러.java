package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main_1302_베스트셀러 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		HashMap<String, Integer> hm = new HashMap<>();
		String in = new String();
		for(int i = 0 ; i < N;i++) {
			in = br.readLine();
			if(hm.containsKey(in)) {
				hm.replace(in, hm.get(in) + 1);
			}else {
				hm.put(in, 1);
			}
		}
		String maxBook = "";
		int max = 0;
		for(String book : hm.keySet()) {
			int val = hm.get(book);
			
			if(max == val && maxBook.compareTo(book) > 0) {
				maxBook = book;
				max = val;
			}else if(max < val) {
				maxBook = book;
				max = val;
			}
		}
		System.out.println(maxBook);
	}
}
