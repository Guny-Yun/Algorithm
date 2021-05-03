package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_1644_소수의연속합 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		boolean[] chk = new boolean[N+1];
		ArrayList<Integer> prime = new ArrayList<>();
		makePrime(chk, N);
		for(int i =2 ; i<= N;i++) {
			if(!chk[i]) prime.add(i);
		}
		int start = 0, count = 0, end = 0, sum = 0;
		while(true) {
			if(sum == N) {
				count++;
				sum -= prime.get(start);
				start++;
			}else if(sum > N) {
				sum -= prime.get(start);
				start++;
			}else if(end == prime.size()) {
				break;
			}else {
				sum += prime.get(end);
				end++;
			}
		}
		
		System.out.println(count);
	}
	public static void makePrime(boolean[] chk,int N) {
		for(int i = 2; i<= N;i++) {
			for(int j = i * 2; j<= N;j+=i) {
				chk[j] = true;
			}
		}
	}
	

}
