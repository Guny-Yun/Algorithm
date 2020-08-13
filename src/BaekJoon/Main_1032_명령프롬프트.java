package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1032_명령프롬프트 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		
		for(int i = 0 ; i < N;i++) {
			arr[i] = br.readLine();
		}
		
		String res = "";
		boolean flag = true;
		
		for(int i = 0 ; i <arr[0].length();i++) {
			for(int j = 1 ; j < N;j++) {
				if(arr[0].charAt(i) == arr[j].charAt(i)) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
			}
			if(!flag) res += "?";
			else res += arr[0].charAt(i);
		}
		
		System.out.print(res);
		
	}

}
