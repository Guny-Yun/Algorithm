package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main_11478_서로다른부분문자열의개수 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		HashSet<String> set = new HashSet<>();
		String tmp = "";
		for(int i = 0 ; i < in.length();i++) {
			tmp = "";
			for(int j = i; j < in.length();j++) {
				tmp += in.substring(j,j+1);
				set.add(tmp);
			}
		}
		System.out.println(set.size());
	}
}
