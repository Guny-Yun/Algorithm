package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_3040_백설공주와일곱난쟁이 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr= new int[9];
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < 9;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		h:for(int i = 0 ; i < 9;i++) {
			for(int j = 0 ; j < 9;j++) {
				if(i != j && sum - arr[i] - arr[j] == 100) {
					for(int k = 0 ; k < 9;k++) {
						if(k != i && k != j)
							sb.append(arr[k]+"\n");
					}
					break h;
				}
			}
		}
		System.out.println(sb);
		
		
	}
	
}
