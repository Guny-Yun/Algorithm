package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main_2628_종이자르기 {

	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());//가로
		int N = Integer.parseInt(st.nextToken());//세로
		int k = Integer.parseInt(br.readLine()); // 횟수
		List<Integer> garo = new ArrayList<>();
		List<Integer> sero = new ArrayList<>();
		garo.add(0);
		garo.add(M);
		sero.add(0);
		sero.add(N);
		int maxgaro =0;
		int maxsero = 0;
		int max = 0;
		for(int i= 0; i<k;i++) {
			st = new StringTokenizer(br.readLine());
			if(Integer.parseInt(st.nextToken()) == 0) {
				sero.add(Integer.parseInt(st.nextToken()));
			}else garo.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(garo);
		Collections.sort(sero);
		for(int i = 1; i<garo.size();i++) {
			maxgaro = Math.max(garo.get(i) - garo.get(i-1),maxgaro);
		}
		for(int i = 1; i<sero.size();i++) {
			maxsero = Math.max(sero.get(i) - sero.get(i-1),maxsero);
		}
		max = maxsero * maxgaro;
		System.out.println(max);
	}

}
