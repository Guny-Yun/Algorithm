package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_3052_나머지 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = new int[10];
		int[] num = new int[42];
		for(int i = 0; i<10;i++) {
			input[i] = Integer.parseInt(br.readLine())%42;
			num[input[i]]++;
		}
		int cnt = 0;
		for(int i = 0; i<42;i++) {
			if(num[i]!=0)cnt++;
		}
		System.out.println(cnt);
	}

}
