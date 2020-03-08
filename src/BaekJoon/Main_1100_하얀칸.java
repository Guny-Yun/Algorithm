package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_1100_하얀칸 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		for (int i = 0; i < 8; i++) {
			String in = br.readLine();
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0) {
					if (j%2 == 0) {
						if(in.charAt(j) == 'F')count++;
					}
				} else {
					if (j%2 == 1) {
						if(in.charAt(j) == 'F')count++;
					}
				}
			}
		}
		System.out.println(count);

	}

}
