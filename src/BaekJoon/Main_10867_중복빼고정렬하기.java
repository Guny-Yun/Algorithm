package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_10867_중복빼고정렬하기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st  = new StringTokenizer(br.readLine()); 
		
		TreeSet<Integer> ts = new TreeSet<>();
		for(int i = 0  ; i < N;i++) {
			int tmp = Integer.parseInt(st.nextToken());
			ts.add(tmp);
		}
		Iterator<Integer> iter = ts.iterator();
		StringBuilder sb =new StringBuilder();
		while(iter.hasNext()) {
			sb.append(iter.next() + " ");
		}
		System.out.println(sb);
	}
}
