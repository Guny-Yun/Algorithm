package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_2785_체인 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int answer = 0;
		
		for(int i = 0 ; i < N;i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(list);
		
		while(true) {
			if(list.size() <= 1)break;
			
			list.set(0,  list.get(0)-1);
			list.remove(list.size()-1);
			if(list.get(0) == 0)list.remove(0);
			answer++;
		}
		System.out.println(answer);
	}
}
