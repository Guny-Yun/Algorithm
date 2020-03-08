package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_3009_네번째점 {

	public static void main(String[] args) throws Exception{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[] xarr = new int[3];
		int[] yarr = new int[3];
		for(int i = 0; i<3;i++) {
			st = new StringTokenizer(br.readLine());
			xarr[i] = Integer.parseInt(st.nextToken());
			yarr[i] = Integer.parseInt(st.nextToken());
		}
		int x = 0;
		int y = 0;
		Arrays.sort(xarr);
		Arrays.sort(yarr);

		if(xarr[0] == xarr[1])x = xarr[2];
		else if(xarr[0] == xarr[2])x = xarr[1];
		else x = xarr[0];
		
		if(yarr[0] == yarr[1])y = yarr[2];
		else if(yarr[0] == yarr[2])y = yarr[1];
		else y = yarr[0];
		
		System.out.println(x + " " + y);
	}

}
