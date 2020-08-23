package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1547_공 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int answer = 0;
		boolean[] arr = new boolean[4];
		arr[1] = true;
		for(int i = 0 ; i < N;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(arr[x] && !arr[y]) {
				arr[x] = false;
				arr[y] = true;
			}else if(!arr[x] && arr[y]) {
				arr[x] = true;
				arr[y] = false;
			}
		}
		for(int i = 0 ; i < 4;i++) {
			if(arr[i])answer = i;
		}
		System.out.println(answer);
	}

}
