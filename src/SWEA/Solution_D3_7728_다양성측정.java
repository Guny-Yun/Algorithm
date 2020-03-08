package SWEA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Solution_D3_7728_다양성측정 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc<=T;tc++) {
			String s = br.readLine();
			HashSet<Character> list =new HashSet<Character>();
			for(int i = 0; i<s.length();i++) {
				list.add(s.charAt(i));
			}
			System.out.println("#" + tc + " " + list.size());
		}
	}
}
