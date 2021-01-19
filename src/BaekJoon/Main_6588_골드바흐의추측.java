package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_6588_골드바흐의추측 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean[] notPrime = new boolean[1000001];
		
		for(int i =2; i<= 1000000; i++) {
			if(!notPrime[i]) {
				for(int j = i * 2; j <= 1000000;j+=i) {
					notPrime[j] = true;
				}
			}
		}
		while(true) {
			int tmp = Integer.parseInt(br.readLine());
			boolean exist = false;
			if(tmp == 0) {
				System.out.println(sb);
				return;
			}
			for(int i = 3; i <= tmp; i+=2) {
				if(!notPrime[i] && !notPrime[tmp -i]) {
					sb.append(tmp + " = " + i + " + " + (tmp - i) + "\n");
					exist = true;
					break;
				}
			}
			if(!exist) System.out.println("Goldbach's conjecture is wrong.");
		}
	}
}
